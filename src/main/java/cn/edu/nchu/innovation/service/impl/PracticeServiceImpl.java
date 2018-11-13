package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Practice;
import cn.edu.nchu.innovation.mapper.PracticeMapper;
import cn.edu.nchu.innovation.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PracticeServiceImpl implements PracticeService {

    @Autowired
    private PracticeMapper practiceMapper;

    @Override
    public Practice getPractice() {
        return practiceMapper.getPractice();
    }

}
