package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Activity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ActivityMapper {

    @Select("select id,name,introduction,url from activity")
    List<Activity> activityList();

    @Select("select id,name,text from activity where id=#{id}")
    Activity getActivityById(int id);
}
