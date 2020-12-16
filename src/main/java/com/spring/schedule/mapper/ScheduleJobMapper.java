package com.spring.schedule.mapper;

import com.spring.schedule.pojo.ScheduleJob;
import com.spring.schedule.pojo.ScheduleJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleJobMapper {
    long countByExample(ScheduleJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleJob record);

    int insertSelective(ScheduleJob record);

    List<ScheduleJob> selectByExample(ScheduleJobExample example);

    ScheduleJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    int updateByExample(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    int updateByPrimaryKeySelective(ScheduleJob record);

    int updateByPrimaryKey(ScheduleJob record);
}