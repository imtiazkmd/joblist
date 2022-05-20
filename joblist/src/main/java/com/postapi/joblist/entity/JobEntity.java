package com.postapi.joblist.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "job")
public class JobEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobid")
    private int jobId;

    @Column(name = "jobname")
    private String jobName;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
