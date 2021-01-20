package com.tp.management.controller;

import com.tp.management.model.OutputDayDO;
import com.tp.management.model.WorkerDO;
import com.tp.management.service.impl.OutputServiceImpl;
import com.tp.management.service.impl.WorkerServiceImpl;
import com.tp.management.vo.OutputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @Author: zjuptian
 * @Date: 2021/1/20 16:10
 * @Description:
 */
@RestController
@RequestMapping("/output")
public class OutputController {
    @Autowired
    private OutputServiceImpl outputService;

    @Autowired
    private WorkerServiceImpl workerService;

    @PostMapping("/getOutputList")
    public String getOutputList(@RequestParam("date") String date){
        List<OutputDayDO> list = outputService.getOutputList(date);
        List<WorkerDO> worker_list = workerService.getWorkerList();
        if(list.size() != worker_list.size()){
            String msg = outputService.createNewList(date);
            return msg;
        }
        return ""+list.size();
    }

    @PostMapping("/addWorkerOutput")
    public String addWorkerOutput(@RequestBody OutputVO outputVO) {
        String msg = outputService.addWorkerOutput(outputVO);
        return msg;
    }
}
