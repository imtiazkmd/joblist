package com.postapi.joblist.serviceImpl;

import com.postapi.joblist.daoImpl.JobDaoImpl;
import com.postapi.joblist.model.JobModel;
import com.postapi.joblist.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobDaoImpl jd;
    @Override
    public String saveJob(JobModel jm) {
        return jd.jobAdd(jm);
    }
}
