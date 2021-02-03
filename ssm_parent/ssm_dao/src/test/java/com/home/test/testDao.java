package com.home.test;

import com.home.dao.ItemsDao;
import com.home.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/*
 * @Classname     ：testDao
 * @author     ：jxx
 * @date       ：Created in 2021/2/3 10:58
 * @description：
 * @modified By：
 * @version:     1.0$
 */
public class testDao {
        @Test
        public void testDao() {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
            ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
            System.out.println("商品列表：：："+itemsDao.findAll());

            Items items = new Items();
            items.setName("商品名称");
            items.setPrice(16666f);
            items.setCreatetime(new Date());
            itemsDao.save(items);
        }
}
