package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Teacher;
import cn.edu.nchu.innovation.mapper.TeacherMapper;
import cn.edu.nchu.innovation.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> onCampus() {
        return teacherMapper.onCampus();
    }

    @Override
    public List<Teacher> offCampus() {
        return teacherMapper.offCampus();
    }
}
