package com.tp.management.service;

import com.tp.management.model.WorkerDO;

import java.util.List;

/**
 * @Author: zjuptian
 * @Date: 2021/1/19 22:37
 * @Description:
 */
public interface WorkerService {
    List<WorkerDO> getWorkerList();

    WorkerDO addWorker(WorkerDO workerDO);

    WorkerDO updateWorker(WorkerDO workerDO);

    WorkerDO deleteWorker(WorkerDO workerDO);
}
