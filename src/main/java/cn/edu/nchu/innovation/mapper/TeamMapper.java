package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Team;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeamMapper {

    /*得到所有团队*/
    @Select("select id,name,introduction,url from team")
    List<Team> teamList();

    /*根据id查询团队*/
    @Select("select id,name,text from team where id=#{id}")
    Team getTeamById(@Param("id") int id);

}
