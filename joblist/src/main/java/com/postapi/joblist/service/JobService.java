package com.postapi.joblist.service;

import com.postapi.joblist.model.JobModel;
import org.springframework.stereotype.Service;


public interface JobService {
    public String saveJob(JobModel jm);
}
