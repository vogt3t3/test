package com.company.shiro;

import com.company.utils.ShiroUtils;
import org.apache.shiro.subject.Subject;

/**
 * Created by Administrator on 2017/11/22 0022.
 */
public class ShiroPermission {
    public static void main(String[] args) {
        Subject authenSubject= ShiroUtils.login("permission_shiro.ini","root","root");
        System.out.println("pricipal:"+authenSubject.getPrincipal());
        System.out.println("************");
        System.out.println(authenSubject.isPermitted("user.delete"));
        System.out.println(authenSubject.isPermitted("user.findAll"));
        System.out.println("**********");
        boolean[] rs=authenSubject.isPermitted("user.findById","user.insert","user.update");
        for(boolean rs1:rs){
            System.out.println(rs1);
        }
        System.out.println("********");
        System.out.println(authenSubject.isPermittedAll("user.findAll","user.insert"));
    }
}
