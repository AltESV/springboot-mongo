package com.fana.springbootmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "roadmaps")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feature {

    @Id
    private String id;

    @NotBlank(message="cannot be blank")
    private String title;

    @NotBlank(message="cannot be blank")
    private String description;
    private String details;
    private String status;
    private String content;
    private int votes;
    private List<String> sessionId;


}
