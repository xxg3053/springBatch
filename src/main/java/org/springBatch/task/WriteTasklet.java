package org.springBatch.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created by kenfo on 2016/5/21.
 */
public class WriteTasklet implements Tasklet {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    private String message;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public String getMessage() {
        return message;
    }

    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        logger.info("message={}", message);
        return RepeatStatus.FINISHED;
    }
}
