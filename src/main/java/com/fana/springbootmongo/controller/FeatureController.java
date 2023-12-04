package com.fana.springbootmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.fana.springbootmongo.model.Feature;
import com.fana.springbootmongo.service.FeatureService;

import java.util.List;

@RestController
@RequestMapping("/feature")
public class FeatureController {
    
    @Autowired
    private FeatureService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Feature createFeature(@RequestBody Feature feature) {
        return service.addFeature(feature);
    }

    @GetMapping
    public List<Feature> getAllFeatures() {
        return service.getAllFeatures();
    }

    @GetMapping("/{id}")
    public Feature getFeature(@PathVariable String id) {
        return service.getFeatureByFeatureId(id);
    }

    @PutMapping
    public Feature updateFeature(@RequestBody Feature feature) {
        return service.updateFeature(null, feature);
    }

    @DeleteMapping("/{id}")
    public String deleteFeature(@PathVariable String id) {
        return service.deleteFeature(id);
    }
}
