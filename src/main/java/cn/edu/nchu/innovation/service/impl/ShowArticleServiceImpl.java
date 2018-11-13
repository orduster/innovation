package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Article;
import cn.edu.nchu.innovation.mapper.ShowArticleMapper;
import cn.edu.nchu.innovation.service.ShowArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShowArticleServiceImpl implements ShowArticleService {

    @Autowired
    private ShowArticleMapper showArticleMapper;

    @Override
    public List<Article> showNotices() {
        return showArticleMapper.showNotices();
    }

    @Override
    public List<Article> showNews() {
        return showArticleMapper.showNews();
    }

    @Override
    public Article showDetails(Integer id) {
        return showArticleMapper.showDetails(id);
    }

    @Override
    public List<Article> allNotices() {
        return showArticleMapper.allNotices();
    }

    @Override
    public List<Article> allNews() {
        return showArticleMapper.allNews();
    }
}
