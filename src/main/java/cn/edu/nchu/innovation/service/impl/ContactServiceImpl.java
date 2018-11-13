package cn.edu.nchu.innovation.service.impl;

import cn.edu.nchu.innovation.entity.Contact;
import cn.edu.nchu.innovation.mapper.ContactMapper;
import cn.edu.nchu.innovation.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactMapper contactMapper;

    @Override
    public Contact getContact() {
        return contactMapper.getContact();
    }

}
