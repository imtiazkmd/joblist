package com.postapi.joblist.daoImpl;

import com.postapi.joblist.dao.JobDao;
import com.postapi.joblist.entity.JobEntity;
import com.postapi.joblist.model.JobModel;
import com.postapi.joblist.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JobDaoImpl implements JobDao {
    @Autowired
    JobRepo jobRepo;
    @Override
    public String jobAdd(JobModel jm) {
        JobEntity je = new JobEntity();
        //je.setJobId(jm.getJobId());
        je.setJobName(jm.getJobName());
        jobRepo.save(je);
        return "Job Saved Successfully";
    }
}
