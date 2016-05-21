package org.springBatch.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersIncrementer;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.batch.core.configuration.annotation.JobScope;

/**
 * Created by kenfo on 2016/5/21.
 */

public class HelloJob implements Job {

    public String getName() {
        return null;
    }

    public boolean isRestartable() {
        return false;
    }

    public void execute(JobExecution jobExecution) {

    }

    public JobParametersIncrementer getJobParametersIncrementer() {
        return null;
    }

    public JobParametersValidator getJobParametersValidator() {
        return null;
    }
}
