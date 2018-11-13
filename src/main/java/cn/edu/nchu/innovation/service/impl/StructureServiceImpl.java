package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Structure;
import cn.edu.nchu.innovation.mapper.StructureMapper;
import cn.edu.nchu.innovation.service.StructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StructureServiceImpl implements StructureService {

    @Autowired
    private StructureMapper structureMapper;

    @Override
    public Structure getStructure() {
        return structureMapper.getStructure();
    }

}
