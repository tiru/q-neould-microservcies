package com.qatarairways.qneouldmicroservice.service;

import com.qatarairways.qneouldmicroservice.model.DashboardResponse;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    public DashboardResponse getDashboardData() {
        DashboardResponse response = new DashboardResponse();
        response.setTotalShipments(847);
        response.setTotalShipmentUpDown("+12% from yesterday");
        response.setOnTimePerformance(92.38);
        response.setOnTimePerformanceUpDown("+3.2% this week");
        response.setRevenue(12.8);
        response.setRevenueUpDown("+8.5% vs last month");
        response.setActiveAlerts(5);
        response.setActiveAlertsUpDown("-15% from last hour");
        return response;
    }
}
