package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Structure;
import org.apache.ibatis.annotations.Select;

public interface StructureMapper {
    @Select("select content,text from structure")
    Structure getStructure();

}
