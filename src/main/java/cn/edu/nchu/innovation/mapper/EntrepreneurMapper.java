package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Entrepreneur;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EntrepreneurMapper {

    /*得到所有团队*/
    @Select("select id,name,introduction,url from entrepreneur")
    List<Entrepreneur> entrepreneurList();

    /*根据id查询团队*/
    @Select("select id,name,text from entrepreneur where id=#{id}")
    Entrepreneur getEntrepreneurById(@Param("id") int id);
}
