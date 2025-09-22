package com.qatarairways.qneouldmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ULDAvailability {
    private String type;
    private int percentage;
    private String label;
    private String color;
    private String iconColor;
}