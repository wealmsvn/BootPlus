package com.abc.bootplus.dao;

import com.abc.bootplus.entity.Permission;
import com.abc.bootplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserDao extends BaseMapper<User> {

    List<Permission> selectMenuId(Integer uid);

}
