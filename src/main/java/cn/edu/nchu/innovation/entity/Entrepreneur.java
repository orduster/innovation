package cn.edu.nchu.innovation.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Entrepreneur {
    private Integer id;
    private String name;//名称
    private String introduction;//简介
    private String url;//保存的图片
    private String content;//正文
    private String text;
}
