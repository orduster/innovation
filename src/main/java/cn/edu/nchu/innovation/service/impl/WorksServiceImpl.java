package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Works;
import cn.edu.nchu.innovation.mapper.WorksMapper;
import cn.edu.nchu.innovation.service.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WorksServiceImpl implements WorksService {

    @Autowired
    private WorksMapper mapper;

    @Override
    public List<Works> getAllWorks() {
        return mapper.getAllWorks();
    }
}
