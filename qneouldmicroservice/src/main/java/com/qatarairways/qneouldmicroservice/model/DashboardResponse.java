package com.qatarairways.qneouldmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardResponse {
    private int totalShipments;
    private String totalShipmentUpDown;
    private double onTimePerformance;
    private String onTimePerformanceUpDown;
    private double revenue;
    private String revenueUpDown;
    private int activeAlerts;
    private String activeAlertsUpDown;
}

