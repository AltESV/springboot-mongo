package com.fana.springbootmongo.repository;

import com.fana.springbootmongo.model.Feature;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeatureRepository extends MongoRepository<Feature, String> {
    
    List<Feature> findAll(Sort sort);
}
