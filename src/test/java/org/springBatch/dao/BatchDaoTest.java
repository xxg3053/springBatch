package org.springBatch.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springBatch.entity.Batch;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kenfo on 2016/5/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml",
        "classpath:spring/spring-batch.xml",
        "classpath:spring/batch.xml"})
public class BatchDaoTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BatchDao batchDao;
    @Test
    public void testQueryAll() throws Exception {
        List<Batch> list = batchDao.queryAll(0,100);
        logger.info("batchs={}", list);
    }


    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job helloWorldJob;

    @Test
    public void testJob() throws Exception {
        try {
            /* 运行Job */
            JobExecution result = jobLauncher.run(helloWorldJob, new JobParameters());
            /* 处理结束，控制台打印处理结果 */
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}