package com.company.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/16 0016.
 */
public class EmpTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("start junit");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("end junit");
    }

    @Test
    public void testGetEmpno() throws Exception {
        System.out.println("get empno test");
        assertEquals(20,18+2);
    }

    @Test
    public void testSetEmpno() throws Exception {

    }

    @Test
    public void testGetSal() throws Exception {

    }

    @Test
    public void testSetSal() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}