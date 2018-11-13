package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Entrepreneur;
import cn.edu.nchu.innovation.mapper.EntrepreneurMapper;
import cn.edu.nchu.innovation.service.EntrepreneurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EntrepreneurServiceImpl implements EntrepreneurService{

    @Autowired
    private EntrepreneurMapper mapper;

    @Override
    public List<Entrepreneur> entrepreneurList() {
        return mapper.entrepreneurList();
    }

    @Override
    public Entrepreneur getEntrepreneurById(int id) {
        return mapper.getEntrepreneurById(id);
    }
}
