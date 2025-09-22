package com.qatarairways.qneouldmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevenueOptimisationResponse {
    private String revenue;
    private int totalRequest;
    private int revenueOptimization;
    private List<RevenueCategory> revenueData;
    private List<ULDAvailability> uldAvailability;
    private List<AreaData> areaRevenueData;
    private List<AreaData> areaProfitData;
}