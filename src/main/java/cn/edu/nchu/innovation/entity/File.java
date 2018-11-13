package cn.edu.nchu.innovation.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 文件上传下载
 */
@Setter
@Getter
@ToString
public class File {
    private Integer id;
    private String sort;//分类
    private String name;//文件名
    private String url;//存储路径
}
