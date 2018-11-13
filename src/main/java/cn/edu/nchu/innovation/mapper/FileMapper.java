package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.File;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FileMapper {

    @Select("select id,name from file where sort='1'")
    List<File> provinceFile();

    @Select("select id,name from file where sort='2'")
    List<File> schoolFile();

    @Select("select id,name from file where sort='3'")
    List<File> resourceFile();

    @Select("select * from file where id=#{id}")
    File getFile(@Param("id") int id);
}
