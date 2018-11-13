package cn.edu.nchu.innovation.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 双创作品
 */
@Setter
@Getter
@ToString
public class Works {
    private Integer id;//主键
    private String name;//名称
    private String member;//团队成员
    private String incident;//获奖情况
    private String url;//图片路径
}
