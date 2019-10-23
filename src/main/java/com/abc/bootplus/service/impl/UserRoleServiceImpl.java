package com.abc.bootplus.service.impl;

import com.abc.bootplus.dao.UserRoleDao;
import com.abc.bootplus.entity.UserRole;
import com.abc.bootplus.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {
}
