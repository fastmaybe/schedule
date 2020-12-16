package com.spring.schedule.mapper;

import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.pojo.DyQuartzJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DyQuartzJobMapper {
    long countByExample(DyQuartzJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DyQuartzJob record);

    int insertSelective(DyQuartzJob record);

    List<DyQuartzJob> selectByExample(DyQuartzJobExample example);

    DyQuartzJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DyQuartzJob record, @Param("example") DyQuartzJobExample example);

    int updateByExample(@Param("record") DyQuartzJob record, @Param("example") DyQuartzJobExample example);

    int updateByPrimaryKeySelective(DyQuartzJob record);

    int updateByPrimaryKey(DyQuartzJob record);
}