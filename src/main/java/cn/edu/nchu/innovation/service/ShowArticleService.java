package cn.edu.nchu.innovation.service;

import cn.edu.nchu.innovation.entity.Article;

import java.util.List;

public interface ShowArticleService {
    List<Article> showNotices();

    List<Article> showNews();

    Article showDetails(Integer id);

    List<Article> allNotices();

    List<Article> allNews();
}
