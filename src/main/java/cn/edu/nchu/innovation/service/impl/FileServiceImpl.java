package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.File;
import cn.edu.nchu.innovation.mapper.FileMapper;
import cn.edu.nchu.innovation.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper mapper;

    @Override
    public List<File> provinceFile() {
        return mapper.provinceFile();
    }

    @Override
    public List<File> schoolFile() {
        return mapper.schoolFile();
    }

    @Override
    public List<File> resourceFile() {
        return mapper.resourceFile();
    }

    @Override
    public File getFile(int id) {
        return mapper.getFile(id);
    }
}
