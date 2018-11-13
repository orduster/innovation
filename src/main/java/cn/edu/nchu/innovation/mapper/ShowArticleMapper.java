package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Article;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShowArticleMapper {

    @Select("select id,title,time from article where sort='通知公告' order by time desc limit 0,5")
    List<Article> showNotices();

    @Select("select id,title,time from article where sort='新闻资讯' order by time desc limit 0,5")
    List<Article> showNews();

    @Select("select id,title,author,`from`,time,text from article where id=#{id}")
    Article showDetails(Integer id);

    @Select("select id,title,time from article where sort='通知公告'")
    List<Article> allNotices();

    @Select("select id,title,time from article where sort='新闻资讯'")
    List<Article> allNews();
}
