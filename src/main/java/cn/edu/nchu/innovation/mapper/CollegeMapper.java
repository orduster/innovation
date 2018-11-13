package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.College;
import org.apache.ibatis.annotations.*;

/**
 * 学院简介
 */
public interface CollegeMapper {

    @Results({
            @Result(property = "time", column = "time")
    })
    @Select("select * from college")
    College getCollege();

}
