package com.tp.management.mapping;

import com.tp.management.model.OutputDayDO;
import com.tp.management.vo.OutputVO;

import java.util.List;

public interface OutputDayDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutputDayDO record);

    int insertSelective(OutputDayDO record);

    OutputDayDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OutputDayDO record);

    int updateByPrimaryKey(OutputDayDO record);

    List<OutputDayDO> selectAll(String date);

    OutputDayDO selectByWokerIdAndDate(OutputVO outputVO);
}
