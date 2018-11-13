package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Practice;
import org.apache.ibatis.annotations.Select;

public interface PracticeMapper {
    @Select("select content,text from practice")
    Practice getPractice();
}
