package com.home.test;

import com.home.pojo.Items;
import com.home.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Classname     ：com.home.test.TestService
 * @author     ：jxx
 * @date       ：Created in 2021/2/3 11:08
 * @description：
 * @modified By：
 * @version:     1.0$
 */
public class TestService {
    @Test
    public void testService() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}
