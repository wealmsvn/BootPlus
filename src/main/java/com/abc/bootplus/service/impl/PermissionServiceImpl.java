package com.abc.bootplus.service.impl;

import com.abc.bootplus.dao.PermissionDao;
import com.abc.bootplus.entity.Permission;
import com.abc.bootplus.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, Permission> implements PermissionService {
}
