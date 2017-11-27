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
public class ShiroSelfRealm {
    public static final Logger log = LoggerFactory.getLogger(ShiroSelfRealm.class);

    public static void main(String[] args) {
        //1-创建SecurityManager安全管理器对象，读取shiro配置文件信息
        SecurityManager securityManager = new IniSecurityManagerFactory
                ("classpath:self_realm_shiro.ini").getInstance();
        SecurityUtils.setSecurityManager(securityManager);//2-配置安全管理工具SecurityUtil
        Subject authenSubject = SecurityUtils.getSubject();//3-获得Subject对象
        //4-获取Token令牌
        AuthenticationToken successToken = new UsernamePasswordToken("scott", "123456");//成功
        try {
            authenSubject.login(successToken);
            log.info("login success!");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("login error!");
        }
        authenSubject.logout();
    }
}
