package com.danozzo.jobmatch.JobMatch.service;

import com.danozzo.jobmatch.JobMatch.model.Application;

import java.util.List;

public interface IApplicationService {
    List<Application> getUserApplications(Long userId);

    Application createApplication(Application application);

    Application updateApplicationStatus(Long applicationId, Application status);

    void deleteApplication(Long applicationId);
}
