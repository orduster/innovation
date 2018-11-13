package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Contact;
import org.apache.ibatis.annotations.Select;

public interface ContactMapper {

    @Select("select address,tele,email from contact")
    Contact getContact();

}
