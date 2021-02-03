package com.home.controller;

import com.home.pojo.Items;
import com.home.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
 * @Classname     ：com.home.controller.ItemsController
 * @author     ：jxx
 * @date       ：Created in 2021/2/3 11:14
 * @description：
 * @modified By：
 * @version:     1.0$
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    /**
     * 列表访问
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(Model model){
        //集合查询
        List<Items> items = itemsService.findAll();
        System.out.println(items);
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }

    /***
     * 事务测试
     * 增加商品
     * @return
     */
    @RequestMapping(value = "/save")
    public String save(Items items){
        int acount =  itemsService.save(items);
        //集合列表页跳转
        return "redirect:/pages/list";
    }
}
