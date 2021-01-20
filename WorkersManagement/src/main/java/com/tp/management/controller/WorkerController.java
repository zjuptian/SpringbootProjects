package com.tp.management.controller;

import com.tp.management.model.WorkerDO;
import com.tp.management.service.impl.WorkerServiceImpl;
import com.tp.management.vo.WorkerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addWorker")
    public WorkerDO addWorker(@RequestBody WorkerVO workerVO){
        WorkerDO workerDO = new WorkerDO();
        workerDO.setName(workerVO.getName());
        workerDO.setDepartment(workerVO.getDepartment());
        workerService.addWorker(workerDO);
        return workerDO;
    }

    @PostMapping("/updateWorker")
    public WorkerDO updateWorker(@RequestBody WorkerDO workerDO){
        workerService.updateWorker(workerDO);
        return workerDO;
    }

    @PostMapping("/deleteWorker")
    public WorkerDO deleteWorker(@RequestBody WorkerDO workerDO){
        workerService.deleteWorker(workerDO);
        return workerDO;
    }
}
