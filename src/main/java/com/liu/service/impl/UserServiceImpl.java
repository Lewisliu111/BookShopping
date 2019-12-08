package com.liu.service.impl;

import com.liu.dao.UsersMapper;
import com.liu.entity.Users;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersDao;


    @Override
    public Users findByUsername(String username) {
      return usersDao.findByUsername(username);
    }
}
