package cn.edu.nchu.innovation.service;

import cn.edu.nchu.innovation.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> showArticle(int pageSize, int pageNumber);

    int countArticle();

    Article getArticleById(int id);

    Article showArticleById(int id);
}
