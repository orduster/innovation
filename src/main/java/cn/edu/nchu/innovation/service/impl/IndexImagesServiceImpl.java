package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.IndexImages;
import cn.edu.nchu.innovation.mapper.IndexImagesMapper;
import cn.edu.nchu.innovation.service.IndexImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IndexImagesServiceImpl implements IndexImagesService {

    @Autowired
    private IndexImagesMapper mapper;

    @Override
    public List<IndexImages> showIndexImages() {
        return mapper.showIndexImages();
    }
}
