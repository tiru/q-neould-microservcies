package com.qatarairways.qneouldmicroservice.service;

import com.qatarairways.qneouldmicroservice.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RevenueOptimisationService {

    public RevenueOptimisationResponse getRevenueOptimisation() {
        List<RevenueCategory> revenueData = Arrays.asList(
                new RevenueCategory("Electronics", 45),
                new RevenueCategory("Pharmaceuticals", 25),
                new RevenueCategory("Automotive", 20),
                new RevenueCategory("Others", 10)
        );

        List<ULDAvailability> uldAvailability = Arrays.asList(
                new ULDAvailability("AKE", 85, "Available: 12", "#10b981", "#9ca3af"),
                new ULDAvailability("LD3", 45, "Available: 5", "#10b981", "#f59e0b"),
                new ULDAvailability("LD3", 70, "In Use: 5", "#10b981", "#9ca3af"),
                new ULDAvailability("PMC", 25, "Limited", "#f59e0b", "#9ca3af")
        );

        List<AreaData> areaRevenueData = Arrays.asList(
                new AreaData("50", 20),
                new AreaData("100", 35),
                new AreaData("042", 15),
                new AreaData("350", 25),
                new AreaData("1005", 30),
                new AreaData("600", 22)
        );

        List<AreaData> areaProfitData = Arrays.asList(
                new AreaData("50", 10),
                new AreaData("100", 18),
                new AreaData("042", 12),
                new AreaData("350", 20),
                new AreaData("1005", 16),
                new AreaData("600", 14)
        );

        return RevenueOptimisationResponse.builder()
                .revenue("1.5")
                .totalRequest(32)
                .revenueOptimization(80)
                .revenueData(revenueData)
                .uldAvailability(uldAvailability)
                .areaRevenueData(areaRevenueData)
                .areaProfitData(areaProfitData)
                .build();
    }
}