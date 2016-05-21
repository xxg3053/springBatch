package org.springBatch.dao;

import org.apache.ibatis.annotations.Param;
import org.springBatch.entity.Batch;

import java.util.List;

/**
 * Created by kenfo on 2016/5/21.
 */

public interface BatchDao {
    /**
     * 查询所有跑批程序
     * @param offset
     * @param limit
     * @return
     */
    List<Batch> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
