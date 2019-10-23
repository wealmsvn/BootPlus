package com.abc.bootplus.service;

import com.abc.bootplus.Vo.Result;
import com.abc.bootplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;


public interface UserService extends IService<User> {


    Result queryMenu();
}
