package com.liu.dao;

import com.liu.entity.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    public Users findByUsername(String username);
}