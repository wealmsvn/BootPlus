package com.abc.bootplus.service.impl;

import com.abc.bootplus.dao.RolePermissionDao;
import com.abc.bootplus.entity.RolePermission;
import com.abc.bootplus.service.RolePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionDao, RolePermission> implements RolePermissionService {
}
