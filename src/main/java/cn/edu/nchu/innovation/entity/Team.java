package cn.edu.nchu.innovation.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 团队实体
 */
@Setter
@Getter
@ToString
public class Team {
    private Integer id;//主键
    private String name;//团队名称
    private String introduction;//简介
    private String url;//保存的图片
    private String content;//正文
    private String text;//带html的详情
}
