package com.tp.learning.mapping;

import com.tp.learning.model.StudentDO;

public interface StudentDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentDO record);

    int insertSelective(StudentDO record);

    StudentDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentDO record);

    int updateByPrimaryKey(StudentDO record);
}
