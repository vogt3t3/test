package com.company.jdbctemplate.impl;

import com.company.jdbctemplate.idao.DeptDao;
import com.company.jdbctemplate.pojo.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
public class DeptImplTest {
    private DeptDao deptDao;
    @org.junit.Before
    public void setUp() throws Exception {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        deptDao=(DeptDao) ctx.getBean("deptDao");

    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("tear down..");
    }

    @org.junit.Test
    public void testFindAll() throws Exception {
        List<Dept> list=deptDao.findAll();
        for(Dept d:list){
            System.out.println(d);
        }

    }

    @org.junit.Test
    public void testFindById() throws Exception {
        Dept d=deptDao.findById(10);
        System.out.println(d);
        assertNotNull(d);
    }
}