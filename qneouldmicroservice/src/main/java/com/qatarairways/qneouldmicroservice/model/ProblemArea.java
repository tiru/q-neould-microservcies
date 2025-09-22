package com.qatarairways.qneouldmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemArea {
    private String location;
    private int incidents;
    private String level;
}