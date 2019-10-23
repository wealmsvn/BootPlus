package com.abc.bootplus.service.impl;

import com.abc.bootplus.Vo.Menu;
import com.abc.bootplus.Vo.Result;
import com.abc.bootplus.dao.UserDao;
import com.abc.bootplus.entity.Permission;
import com.abc.bootplus.entity.User;
import com.abc.bootplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {


    @Override
    public Result queryMenu() {
//      判断项目的菜单级别1、用户的id，查找到是否有父类

        List<Permission> permissions =getBaseMapper().selectMenuId(1);

        List<Menu> menus = new ArrayList<>();

        for (int i = 0; i < permissions.size(); i++) {
            Permission permission = permissions.get(i);
            Menu menu = new Menu();
           menu.setName(permission.getName());
           menu.setMurl(permission.getPrms());
           menu.setId(permission.getId());
           menu.setIcons(permission.getIcon());
           menu.setLevel(permission.getLevel());
           menu.setChilds(new ArrayList<>());

           if (permission.getLevel()==1){
               menus.add(menu);
           }else if(permission.getLevel() == 2){
//               如果是个二级菜单，那么开始寻找一级菜单
               int index=searchParent(menus,permission.getParentid());

               if(index >0){
                   Menu menuBean = menus.get(index);
                   menuBean.getChilds().add(menuBean);
               }
           }
        }


        return Result.setOK(menus);
    }

    private Integer searchParent(List<Menu> menus,Integer id){
        for (int i = 0; i <menus.size() ; i++) {
            if(menus.get(i).getId()==id){
                return i;
            }
        }

        return -1;
    }
}
