package com.company;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
public class EntityManagerTest extends TestCase {
    private ApplicationContext act;
    @Before
    public void setUp() throws Exception {
    act=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void tearDown() throws Exception {
    act=null;
    }
    @Test
    public void testManagerFactory(){

    }
}