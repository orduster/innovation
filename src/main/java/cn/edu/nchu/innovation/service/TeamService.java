package cn.edu.nchu.innovation.service;

import cn.edu.nchu.innovation.entity.Team;

import java.util.List;

public interface TeamService {
    List<Team> teamList();

    Team getTeamById(int id);
}
