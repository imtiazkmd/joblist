package com.postapi.joblist.controller;

import com.postapi.joblist.model.JobModel;
import com.postapi.joblist.validations.JobValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    @Autowired
    JobValidation jv;

    @PostMapping("savejob")
    public String saveJob(@RequestBody JobModel jm){
        return jv.validateJobName(jm);
    }
}
