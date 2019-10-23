package com.abc.bootplus.controller;

import com.abc.bootplus.Vo.Result;
import com.abc.bootplus.entity.User;
import com.abc.bootplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
//    查询所有
    @GetMapping("/user/queryAll")

    public Result show(){
        return Result.setResult(true,userService.list());
    }

    //    增加
    @PostMapping("/user/addUser")
    public Result addUser(User user){
        return Result.setOK(userService.save(user));
    }

    //    删除
    @DeleteMapping("/user/deleteUser")
    public Result deleteUser(int id){

        return Result.setOK(userService.removeById(id));
    }

    //    修改
    @PutMapping("/user/updateUser")
    public Result updateUser(User user){

        return Result.setOK(userService.updateById(user));
    }

    /**
     * 查询左菜单
     * @return result 结果
     */
    @GetMapping("/user/queryMenu")
    public Result saveMenu(){

        return userService.queryMenu();
    }


}
