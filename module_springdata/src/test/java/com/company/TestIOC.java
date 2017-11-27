package com.company;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
public class TestIOC extends TestCase {
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void tearDown() throws Exception {
        ctx=null;
    }
    @Test
    public void testdataSource(){
        DataSource dataSource= (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
        assertNotNull(dataSource);
    }
}