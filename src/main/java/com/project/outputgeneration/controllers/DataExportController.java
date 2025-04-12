package com.project.outputgeneration.controllers;

import com.project.outputgeneration.service.ScheduledReportService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/export")
public class DataExportController {

    private final ScheduledReportService dataExportService;

    public DataExportController(ScheduledReportService dataExportService) {
        this.dataExportService = dataExportService;
    }

    // Manually trigger the job
    @PostMapping("/trigger-job")
    public String triggerJob() throws Exception {
        dataExportService.fetchDataAndProcess();
        return "Job triggered successfully!";
    }
}

