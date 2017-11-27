package com.company.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

/**
 * Created by Teacher on 2017/11/22.
 */
public class ShiroUtils {
    public static Subject login(String iniFile,String username,String password){
        SecurityManager securityManager = new IniSecurityManagerFactory("classpath:"+iniFile).createInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject currentUser = SecurityUtils.getSubject();
        AuthenticationToken userToken = new UsernamePasswordToken(username,password);
        try {
            currentUser.login(userToken);
        }catch(AuthenticationException e){
            e.printStackTrace();
        }
        return currentUser;
    }
}
