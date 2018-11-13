package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.IndexImages;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IndexImagesMapper {

    @Select("select id,url from indeximages ")
    List<IndexImages> showIndexImages();
}
