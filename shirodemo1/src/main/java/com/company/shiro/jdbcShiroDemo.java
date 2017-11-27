package com.company.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;


/**
 * Created by Administrator on 2017/11/22 0022.
 */
public class jdbcShiroDemo {
    public static void main(String[] args) {
        SecurityManager securityManager = new IniSecurityManagerFactory("classpath:jdbc_realm_shiro.ini").getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject authenUser=SecurityUtils.getSubject();
        AuthenticationToken successToken=new UsernamePasswordToken("scott","tiger");
        AuthenticationToken failureToken=new UsernamePasswordToken("root","123");
        try{
            authenUser.login(successToken);
            System.out.println("Authentication Success");
        }catch(AuthenticationException e){
            e.printStackTrace();
            System.out.println("Login failure");
        }
        authenUser.logout();
    }




}
