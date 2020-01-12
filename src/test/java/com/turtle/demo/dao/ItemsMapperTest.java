package com.turtle.demo.dao;

import com.turtle.demo.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试dao层的ItemsMapper接口
 */
public class ItemsMapperTest {

    @Test
    public void testFindById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper itemsMapper = applicationContext.getBean("itemsMapper",ItemsMapper.class);
        Items items = itemsMapper.findById(1);
        System.out.println(items.getName());
    }
}
