package com.danozzo.jobmatch.JobMatch.service;

import com.danozzo.jobmatch.JobMatch.exception.ApplicationException;
import com.danozzo.jobmatch.JobMatch.model.Application;
import com.danozzo.jobmatch.JobMatch.repository.ApplicationRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl implements IApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public List<Application> getUserApplications(Long userId) {
        return applicationRepository.findByUserId(userId);
    }

    @Override
    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }

    @SneakyThrows
    @Override
    public Application updateApplicationStatus(Long applicationId, Application application) {
        if (!applicationRepository.existsById(applicationId)) {
            throw new ApplicationException("Id not found");
        }
        application = applicationRepository.findById(applicationId).orElseGet(Application::new);
        application.setStatus(application.getStatus());
        return applicationRepository.save(application);
    }

    @Override
    public void deleteApplication(Long applicationId) {
        applicationRepository.deleteById(applicationId);
    }

}
