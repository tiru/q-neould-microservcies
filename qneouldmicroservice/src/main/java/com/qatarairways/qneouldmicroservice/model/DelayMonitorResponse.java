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
public class DelayMonitorResponse {
    private List<DelayTrendData> trendData;
    private List<ActiveFlight> activeFlights;
    private List<ProblemArea> problemAreas;
    private List<DelayReason> delayReasons;
}