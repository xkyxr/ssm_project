package com.home.pojo;

import lombok.Data;

import java.util.Date;

/*
 * @Classname     ：com.home.pojo.Items
 * @author     ：jxx
 * @date       ：Created in 2021/2/3 10:27
 * @description：
 * @modified By：
 * @version:     1.0$
 */
@Data
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}
