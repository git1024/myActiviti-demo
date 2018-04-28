package com.demo5;

import java.io.Serializable;

/**
 * @author yaoyuanliang
 * @date 2018/4/28
 */
public class Person implements Serializable{

    private static final long serialVersionUID = 6757393795687480331L;

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
