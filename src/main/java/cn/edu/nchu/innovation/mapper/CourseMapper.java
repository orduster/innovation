package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Course;
import org.apache.ibatis.annotations.Select;

public interface CourseMapper {

    @Select("select content,text from course")
    Course getCourse();

}
