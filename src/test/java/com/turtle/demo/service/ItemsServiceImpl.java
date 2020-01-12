package com.turtle.demo.service;

import com.turtle.demo.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 itemsServiceImpl接口
 */
public class ItemsServiceImpl {

    /**
     * 测试ItemsService接口中的findById方法
     */
    @Test
    public void testFindById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = applicationContext.getBean("itemsServiceImpl",ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
