package org.springBatch.entity;

import java.util.Date;

/**
 * Created by kenfo on 2016/5/21.
 */
public class Batch {

    private Long batchId;
    private String name;
    private Date createTime;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
