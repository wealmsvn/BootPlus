package com.abc.bootplus.Vo;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private int id;
    private String name;
    private String murl;
    private String icons;
    private Integer level;
    private List<Menu> childs;


}
