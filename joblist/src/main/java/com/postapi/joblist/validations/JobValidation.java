package com.postapi.joblist.validations;

import com.postapi.joblist.model.JobModel;
import com.postapi.joblist.serviceImpl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobValidation {
    @Autowired
    JobServiceImpl jsi;
    public String validateJobName(JobModel jm){
        if(jm.getJobName() == null || jm.getJobName().length()>8){
            return "Name should not be null Or Enter within 5 Charactors";
        }
        else{
            return jsi.saveJob(jm);
        }
    }

}
