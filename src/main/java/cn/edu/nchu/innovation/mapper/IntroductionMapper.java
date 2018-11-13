package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Introduction;
import org.apache.ibatis.annotations.Select;

public interface IntroductionMapper {

    @Select("select * from introduction")
    Introduction getIntroduction();

}
