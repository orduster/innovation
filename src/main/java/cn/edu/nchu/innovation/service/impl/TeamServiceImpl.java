package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Team;
import cn.edu.nchu.innovation.mapper.TeamMapper;
import cn.edu.nchu.innovation.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<Team> teamList() {
        return teamMapper.teamList();
    }

    @Override
    public Team getTeamById(int id) {
        return teamMapper.getTeamById(id);
    }

}
