package cn.edu.nchu.innovation.service;

import cn.edu.nchu.innovation.entity.File;

import java.util.List;

public interface FileService {
    List<File> provinceFile();

    List<File> schoolFile();

    List<File> resourceFile();

    File getFile(int id);
}
