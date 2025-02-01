package com.telusko.JobApp.repo;

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class JobRepo {


    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"JAVA Development","test",2, Collections.singletonList("java")),
            new JobPost(1,"python Development","test",2, Collections.singletonList("python"))
    ));


    public List<JobPost> getAllJobs()
    {
        return jobs;

    }

    public void addJob(JobPost job)
    {
        jobs.add(job);
        System.out.println(jobs);
    }


}
