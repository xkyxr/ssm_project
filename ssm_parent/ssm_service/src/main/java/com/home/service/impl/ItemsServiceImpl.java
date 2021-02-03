package com.home.service.impl;

import com.home.dao.ItemsDao;
import com.home.pojo.Items;
import com.home.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Classname     ：com.home.service.impl.ItemsServiceImpl
 * @author     ：jxx
 * @date       ：Created in 2021/2/3 11:05
 * @description：
 * @modified By：
 * @version:     1.0$
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    /***
     * 集合查询
     * @return
     */
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    public int save(Items items) {
        int acount = itemsDao.save(items);

        System.out.println("acount:"+acount);

        //测试事务，如果出错，是否回滚
        //int q=10/0;

        return acount;
    }
}