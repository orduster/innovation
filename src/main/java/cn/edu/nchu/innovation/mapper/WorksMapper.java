package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Works;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface WorksMapper {

    @Select("select * from works")
    List<Works> getAllWorks();
}
