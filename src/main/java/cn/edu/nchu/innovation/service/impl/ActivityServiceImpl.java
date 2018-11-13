package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Activity;
import cn.edu.nchu.innovation.mapper.ActivityMapper;
import cn.edu.nchu.innovation.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper mapper;

    @Override
    public List<Activity> activityList() {
        return mapper.activityList();
    }

    @Override
    public Activity getActivityById(int id) {
        return mapper.getActivityById(id);
    }
}
