package cn.edu.nchu.innovation.service;

import cn.edu.nchu.innovation.entity.Entrepreneur;

import java.util.List;

public interface EntrepreneurService {

    List<Entrepreneur> entrepreneurList();

    Entrepreneur getEntrepreneurById(int id);
}
