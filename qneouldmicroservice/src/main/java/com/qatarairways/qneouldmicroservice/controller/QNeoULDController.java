package com.qatarairways.qneouldmicroservice.controller;

import com.qatarairways.qneouldmicroservice.model.DashboardResponse;
import com.qatarairways.qneouldmicroservice.model.RevenueOptimisationResponse;
import com.qatarairways.qneouldmicroservice.model.DelayMonitorResponse;
import com.qatarairways.qneouldmicroservice.model.DelayPredictionResponse;
import com.qatarairways.qneouldmicroservice.service.DashboardService;
import com.qatarairways.qneouldmicroservice.service.RevenueOptimisationService;
import com.qatarairways.qneouldmicroservice.service.DelayMonitorService;
import com.qatarairways.qneouldmicroservice.service.DelayPredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qneould/api/v1")
public class QNeoULDController {

    @Autowired
    private DashboardService dashboardService;

    @Autowired
    private RevenueOptimisationService revenueOptimisationService;

    @Autowired
    private DelayMonitorService delayMonitorService;

    @Autowired
    private DelayPredictionService delayPredictionService;

    @GetMapping("/status")
    public String statuString() {
        return "QNeoULD Microservice is up and running!" ;
    }

    @GetMapping("/dashboard")
    public DashboardResponse getDashboard() {
        return dashboardService.getDashboardData();
    }

    @GetMapping("/revenue-optimisation")
    public RevenueOptimisationResponse getRevenueOptimisation() {
        return revenueOptimisationService.getRevenueOptimisation();
    }

    @GetMapping("/delay-monitor")
    public DelayMonitorResponse getDelayMonitor() {
        return delayMonitorService.getDelayMonitorData();
    }

    @GetMapping("/delay-prediction")
    public DelayPredictionResponse getDelayPrediction() {
        return delayPredictionService.getDelayPrediction();
    }
}
