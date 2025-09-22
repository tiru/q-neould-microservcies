package com.qatarairways.qneouldmicroservice.service;

import com.qatarairways.qneouldmicroservice.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DelayMonitorService {

    public DelayMonitorResponse getDelayMonitorData() {
        List<DelayTrendData> trendData = Arrays.asList(
                new DelayTrendData("00:00", 12, 45),
                new DelayTrendData("04:00", 8, 52),
                new DelayTrendData("08:00", 25, 38),
                new DelayTrendData("12:00", 18, 42),
                new DelayTrendData("16:00", 30, 35),
                new DelayTrendData("20:00", 22, 40),
                new DelayTrendData("24:00", 15, 48)
        );

        List<ActiveFlight> activeFlights = Arrays.asList(
                new ActiveFlight("FLT-789", "LAX to JFK", "14:30", "45m", "Delayed", "warning"),
                new ActiveFlight("FLT-456", "ORD to MIA", "16:15", "25m", "Minor Delay", "info"),
                new ActiveFlight("FLT-123", "DEN to SEA", "18:00", "60m", "Critical", "danger")
        );

        List<ProblemArea> problemAreas = Arrays.asList(
                new ProblemArea("Northeast US", 12, "high"),
                new ProblemArea("Central Europe", 8, "medium"),
                new ProblemArea("Asia Pacific", 15, "high"),
                new ProblemArea("Middle East", 5, "low")
        );

        List<DelayReason> delayReasons = Arrays.asList(
                new DelayReason("Weather", 30),
                new DelayReason("Ground Handling", 25),
                new DelayReason("Customs", 20),
                new DelayReason("Mechanical", 15),
                new DelayReason("Other", 10)
        );

        return DelayMonitorResponse.builder()
                .trendData(trendData)
                .activeFlights(activeFlights)
                .problemAreas(problemAreas)
                .delayReasons(delayReasons)
                .build();
    }
}