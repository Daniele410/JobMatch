package com.danozzo.jobmatch.JobMatch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApplicationDto {

    private Long id;
    private Long jobId;
    private Long userId;
    private String status;
    private String message;

    @Override
    public String toString() {
        return "ApplicationDto{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
