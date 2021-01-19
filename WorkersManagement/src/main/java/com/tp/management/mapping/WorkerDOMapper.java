package com.tp.management.mapping;

import com.tp.management.model.WorkerDO;

import java.util.List;

public interface WorkerDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkerDO record);

    int insertSelective(WorkerDO record);

    WorkerDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkerDO record);

    int updateByPrimaryKey(WorkerDO record);

    List<WorkerDO> selectAll();
}
