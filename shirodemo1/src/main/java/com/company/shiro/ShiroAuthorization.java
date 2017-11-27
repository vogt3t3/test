package com.company.shiro;

import com.company.utils.ShiroUtils;
import org.apache.shiro.subject.Subject;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/11/22 0022.
 */
public class ShiroAuthorization {


    public static void main(String[] args) {
        Subject currentUser= ShiroUtils.login("authorization_shiro.ini","admin","123456");
        System.out.println("principal:"+currentUser.getPrincipal());
        //判断是否拥有某一个角色
        System.out.println("***hasRole");
        System.out.println("role1:"+currentUser.hasRole("role1"));
        //遍历集合中的每一个角色，判断用户是否拥有，有返回true,没有返回false，返回值是boolean数组
        System.out.println("***hasRoles***");
        boolean[] rs=currentUser.hasRoles(Arrays.asList("role1","role3","role4"));
        for(int i=0;i<rs.length;i++){
            System.out.println(rs[i]);
        }
        //判断用户是否拥有集合中的所有角色，拥有所有返回true,否则返回false
        System.out.println("***hasAllRoles***");
        System.out.println("hasAllRoles:"+currentUser.hasAllRoles(Arrays.asList("role2","role3")));
        currentUser.logout();

    }
}
