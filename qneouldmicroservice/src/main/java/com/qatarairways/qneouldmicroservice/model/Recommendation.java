package com.qatarairways.qneouldmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recommendation {
    private String icon;
    private String title;
    private String description;
    private String priority;
}