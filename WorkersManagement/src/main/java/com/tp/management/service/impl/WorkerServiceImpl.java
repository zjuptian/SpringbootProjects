package com.tp.management.service.impl;

import com.tp.management.mapping.WorkerDOMapper;
import com.tp.management.model.WorkerDO;
import com.tp.management.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zjuptian
 * @Date: 2021/1/19 22:38
 * @Description:
 */
@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerDOMapper workerDOMapper;

    @Override
    public List<WorkerDO> getWorkerList() {
        List<WorkerDO> list = workerDOMapper.selectAll();
        return list;
    }
}
