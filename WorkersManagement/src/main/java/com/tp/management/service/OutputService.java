package com.tp.management.service;

import com.tp.management.model.OutputDayDO;
import com.tp.management.vo.OutputVO;

import java.util.List;

/**
 * @Author: zjuptian
 * @Date: 2021/1/20 16:16
 * @Description:
 */
public interface OutputService {
    List<OutputDayDO> getOutputList(String date);

    String createNewList(String date);

    String addWorkerOutput(OutputVO outputVO);
}
