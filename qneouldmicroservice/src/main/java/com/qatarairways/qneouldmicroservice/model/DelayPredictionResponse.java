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
public class DelayPredictionResponse {
    private List<DelayPredictionData> delayPredictionData;
    private List<RiskData> riskData;
    private List<Recommendation> recommendations;
}