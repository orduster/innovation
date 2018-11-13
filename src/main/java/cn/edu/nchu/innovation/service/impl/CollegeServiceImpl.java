package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.College;
import cn.edu.nchu.innovation.mapper.CollegeMapper;
import cn.edu.nchu.innovation.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeMapper mapper;

    @Override
    public College getCollege() {
        return mapper.getCollege();
    }


}
