package com.qatarairways.qneouldmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActiveFlight {
    private String number;
    private String route;
    private String scheduled;
    private String delay;
    private String status;
    private String severity;
}