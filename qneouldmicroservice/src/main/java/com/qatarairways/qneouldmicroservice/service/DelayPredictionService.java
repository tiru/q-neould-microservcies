package com.qatarairways.qneouldmicroservice.service;

import com.qatarairways.qneouldmicroservice.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DelayPredictionService {

    public DelayPredictionResponse getDelayPrediction() {
        List<DelayPredictionData> delayPredictionData = Arrays.asList(
                new DelayPredictionData("06:00", 15),
                new DelayPredictionData("09:00", 35),
                new DelayPredictionData("12:00", 28),
                new DelayPredictionData("15:00", 42),
                new DelayPredictionData("18:00", 31),
                new DelayPredictionData("21:00", 18)
        );

        List<RiskData> riskData = Arrays.asList(
                new RiskData("Weather", 35),
                new RiskData("Traffic", 25),
                new RiskData("Operational", 25),
                new RiskData("Other", 15)
        );

        List<Recommendation> recommendations = Arrays.asList(
                new Recommendation("🔄", "Route Optimization", "Consider alternate routes for flights FLT-456, FLT-789", "high"),
                new Recommendation("📦", "ULD Reallocation", "Redistribute cargo load to optimize weight distribution", "medium"),
                new Recommendation("⚡", "Priority Handling", "Fast-track high-value shipments through customs", "high")
        );

        return DelayPredictionResponse.builder()
                .delayPredictionData(delayPredictionData)
                .riskData(riskData)
                .recommendations(recommendations)
                .build();
    }
}