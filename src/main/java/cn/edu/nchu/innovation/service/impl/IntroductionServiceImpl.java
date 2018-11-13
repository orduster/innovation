package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Introduction;
import cn.edu.nchu.innovation.mapper.IntroductionMapper;
import cn.edu.nchu.innovation.service.IntroductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IntroductionServiceImpl implements IntroductionService {

    @Autowired
    private IntroductionMapper introductionMapper;

    @Override
    public Introduction getIntroduction() {
        return introductionMapper.getIntroduction();
    }

}
