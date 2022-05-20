package com.postapi.joblist.repo;

import com.postapi.joblist.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface JobRepo extends JpaRepository<JobEntity,Integer> {
    JobEntity findByJobName(String jobName);
}
