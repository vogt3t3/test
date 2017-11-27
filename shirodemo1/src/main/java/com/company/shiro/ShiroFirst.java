package com.company.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/11/22 0022.
 */
public class ShiroFirst {
    public static final Logger log= LoggerFactory.getLogger(ShiroFirst.class);

    public static void main(String[] args) {
        SecurityManager securityManager=new IniSecurityManagerFactory("classpath:simple_shiro.ini").getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject authenSubject=SecurityUtils.getSubject();
        System.out.println(authenSubject.getPrincipal());
        AuthenticationToken successToken=new UsernamePasswordToken("scott","tiger");
        System.out.println(successToken.getPrincipal());
        System.out.println(successToken.getCredentials());
        AuthenticationToken failToken=new UsernamePasswordToken("scott","123456");
        try {
          //  authenSubject.login(successToken);
            authenSubject.login(successToken);
            System.out.println(authenSubject.getPrincipal());
            log.info("login success!");
        }catch (Exception e){
            e.printStackTrace();
            log.error("login error");
        }
    authenSubject.logout();

    }
}
