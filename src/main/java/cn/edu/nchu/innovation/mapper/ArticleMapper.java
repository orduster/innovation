package cn.edu.nchu.innovation.mapper;

import cn.edu.nchu.innovation.entity.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ArticleMapper {
    /*得到列表*/
    @Select("select id,sort,title,author,time from article order by time desc limit #{arg1},#{arg0}")
    List<Article> showArticle(int pageSize, int pageNumber);

    /*统计总数*/
    @Select("select count(*) from article")
    int countArticle();

    /*根据id查看*/
    @Select("select id,title,author,'from',content from article where id=#{id}")
    Article getArticleById(@Param("id") int id);

    /**/
    @Select("select id,title,author,'from',content,text from article where id=#{id}")
    Article showArticleById(@Param("id") int id);
}
