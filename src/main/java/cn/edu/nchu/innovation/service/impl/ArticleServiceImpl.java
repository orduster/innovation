package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Article;
import cn.edu.nchu.innovation.mapper.ArticleMapper;
import cn.edu.nchu.innovation.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> showArticle(int pageSize, int pageNumber) {
        return articleMapper.showArticle(pageSize, pageNumber);
    }

    @Override
    public int countArticle() {
        return articleMapper.countArticle();
    }

    @Override
    public Article getArticleById(int id) {
        return articleMapper.getArticleById(id);
    }

    @Override
    public Article showArticleById(int id) {
        return articleMapper.showArticleById(id);
    }

}
