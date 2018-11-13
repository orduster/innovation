package cn.edu.nchu.innovation.service;

import cn.edu.nchu.innovation.entity.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> activityList();

    Activity getActivityById(int id);
}
