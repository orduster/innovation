package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Course;
import cn.edu.nchu.innovation.mapper.CourseMapper;
import cn.edu.nchu.innovation.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Course getCourse() {
        return courseMapper.getCourse();
    }

}
