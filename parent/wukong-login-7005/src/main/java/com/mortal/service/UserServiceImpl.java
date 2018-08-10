package com.mortal.service;
import com.mortal.dao.UserDao;
import com.mortal.pojo.Username;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public Username findName(String name) {
        return userDao.findName(name);
    }
}
