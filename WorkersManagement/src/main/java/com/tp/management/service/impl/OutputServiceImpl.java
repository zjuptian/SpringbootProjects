package com.tp.management.service.impl;

import com.tp.management.mapping.OutputDayDOMapper;
import com.tp.management.mapping.WorkerDOMapper;
import com.tp.management.model.OutputDayDO;
import com.tp.management.model.WorkerDO;
import com.tp.management.service.OutputService;
import com.tp.management.vo.OutputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @Author: zjuptian
 * @Date: 2021/1/20 16:16
 * @Description:
 */
@Service
public class OutputServiceImpl implements OutputService {
    @Autowired
    private OutputDayDOMapper outputDayDOMapper;

    @Autowired
    private WorkerDOMapper workerDOMapper;

    @Override
    public List<OutputDayDO> getOutputList(String date) {
        List<OutputDayDO> list = outputDayDOMapper.selectAll(date);
        return list;
    }

    @Override
    public String createNewList(String date) {
        List<WorkerDO> workerList = workerDOMapper.selectAll();
        List<OutputDayDO> OutputList = outputDayDOMapper.selectAll(date);
        boolean flag;
        if(OutputList.size() == 0){
            for(WorkerDO worker : workerList){
                OutputDayDO cur_output = new OutputDayDO();
                cur_output.setWorkerId(worker.getId());
                cur_output.setCount(0);
                cur_output.setOutputDay(0);
                cur_output.setDate(date);
                outputDayDOMapper.insert(cur_output);
            }
        }
        else{
            for(WorkerDO worker : workerList){
                flag = true;
                for(OutputDayDO output : OutputList){
                    if(worker.getId().equals(output.getWorkerId())){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    OutputDayDO cur_output = new OutputDayDO();
                    cur_output.setWorkerId(worker.getId());
                    cur_output.setCount(0);
                    cur_output.setOutputDay(0);
                    cur_output.setDate(date);
                    outputDayDOMapper.insert(cur_output);
                }
            }
        }

        return "Success";
    }

    @Override
    public String addWorkerOutput(OutputVO outputVO){
        OutputDayDO outputDayDO = outputDayDOMapper.selectByWokerIdAndDate(outputVO);
        int count = outputDayDO.getCount();
//        int output_day = outputDayDO.getOutputDay();
//        output_day += outputVO.getOutput();
        int output_day = 0;
        count++;
        String methodName = "setOutput" + count;
        try{
            Method method = outputDayDO.getClass().getMethod(methodName, Integer.class);
            method.invoke(outputDayDO, outputVO.getOutput());
            for(int i = 1; i <= count; i++){
                String methodName_temp = "getOutput"+i;
                Method method_tmp = outputDayDO.getClass().getMethod(methodName_temp);
                output_day += (Integer)method_tmp.invoke(outputDayDO);
            }
            outputDayDO.setOutputDay(output_day);
        }catch (Exception e){
            System.out.println("错误");
        }
        outputDayDO.setCount(count);
        outputDayDOMapper.updateByPrimaryKey(outputDayDO);
        return "Success";
    }
}
