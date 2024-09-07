package com.danozzo.jobmatch.JobMatch.controller;

import com.danozzo.jobmatch.JobMatch.model.Application;
import com.danozzo.jobmatch.JobMatch.model.User;
import com.danozzo.jobmatch.JobMatch.service.IApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applications")
public class ApplicationController {

    @Autowired
    private IApplicationService applicationService;

    @GetMapping("/user/{userId}")
    public List<Application> getUserApplications(@PathVariable Long userId) {
        return applicationService.getUserApplications(userId);
    }

    @PostMapping("/user/{userId}")
    public Application createApplication(@PathVariable Long userId, @RequestBody Application application) {
        application.setUser(new User(userId));
        return applicationService.createApplication(application);
    }

    @PutMapping("/update/{applicationId}")
    public Application updateApplicationStatus(@PathVariable Long applicationId, @RequestBody Application status) {
        return applicationService.updateApplicationStatus(applicationId, status);
    }

    @DeleteMapping("/delete/{applicationId}")
    public void deleteApplication(@PathVariable Long applicationId) {
        applicationService.deleteApplication(applicationId);
    }
}
