package com.fana.springbootmongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fana.springbootmongo.model.Feature;
import com.fana.springbootmongo.repository.FeatureRepository;
import java.util.List;

@Service
public class FeatureService {
    
    @Autowired
    private FeatureRepository repository;

    public Feature addFeature(Feature feature) {
        return repository.save(feature);
    }

    public List<Feature> getAllFeatures() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "votes"));
    }

    public Feature getFeatureByFeatureId(String featureId) {
        return repository.findById(featureId).get();
    }

    public Feature updateFeature(String id, Feature featureRequest) {
        Feature existingFeature = repository.findById(id).get();
        existingFeature.setDescription(featureRequest.getDescription());
        existingFeature.setTitle(featureRequest.getTitle());
        existingFeature.setContent(featureRequest.getContent());
        existingFeature.setStatus(featureRequest.getStatus());
        existingFeature.setDetails(featureRequest.getDetails());
        return repository.save(existingFeature);
    }

    public String deleteFeature(String id) {
        repository.deleteById(id);
        return id + "task deleted";
    }

}
