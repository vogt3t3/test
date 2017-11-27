package com.company.service;

import com.company.dao.pojo.User;
import com.company.dao.repository.UserPagingAndSortingRepository;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/18 0018.
 */

public class UserRepositoryTest extends TestCase {
    private ApplicationContext ctx;
    private UserService userService;
    private UserPagingAndSortingRepository userPagingAndSortingReposity;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        userService= (UserService) ctx.getBean("userService");
        userPagingAndSortingReposity= (UserPagingAndSortingRepository) ctx.getBean("userPagingAndSortingRepository");
    }

    @After
    public void tearDown() throws Exception {
    ctx=null;
    }

    @Test
    public void testSaveUsers() throws Exception {
        List<User> users=new ArrayList<User>();
        User user=null;
        for(int i=1;i<50;i++){
            user=new User("user"+i,60-i,4000.00+i*10);
            users.add(user);
        }
        userService.saveUsers(users);
    }
    @Test
    public void testSorting(){
        Sort.Order order=new Sort.Order(Sort.Direction.DESC,"id");
        Sort sort=new Sort(order);
        List<User> users=(List<User>)userPagingAndSortingReposity.findAll(sort);
        for(User user:users){
            System.out.println(user);
        }
    }
    @Test
    public void testPaging(){
        Pageable pageable=new PageRequest(4,10);
        Page<User> userPage=userPagingAndSortingReposity.findAll(pageable);
        List<User> users=userPage.getContent();
        for(User u:users){
            System.out.println(u);
        }
    }
}