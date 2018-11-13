package cn.edu.nchu.innovation.service;

import cn.edu.nchu.innovation.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> onCampus();

    List<Teacher> offCampus();
}
