package com.tp.management.controller;

import com.tp.management.model.WorkerDO;
import com.tp.management.service.impl.WorkerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zjuptian
 * @Date: 2021/1/19 22:34
 * @Description:
 */
@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkerServiceImpl workerService;

    @GetMapping("/getWorkerList")
    public List<WorkerDO> getWorkerList(){
        List<WorkerDO> list = workerService.getWorkerList();
        return list;
    }
}
