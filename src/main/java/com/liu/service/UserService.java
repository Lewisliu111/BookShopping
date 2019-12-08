package com.liu.service;


import com.liu.entity.Users;
import org.springframework.stereotype.Service;


public interface UserService {
    public Users findByUsername(String username);
}
