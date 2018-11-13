package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select name,position,description from teacher where sort='校内导师团'")
    List<Teacher> onCampus();

    @Select("select name,position,description from teacher where sort='校外导师团'")
    List<Teacher> offCampus();
}
