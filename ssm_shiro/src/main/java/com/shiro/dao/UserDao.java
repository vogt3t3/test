package com.shiro.dao;

import com.shiro.pojo.User;

import java.util.Set;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User getByUsername(String username);

    /**
     *通过用户名查询角色信息
     * @param username
     * @return
     */
    public Set<String> getRoles(String username);

    /**
     * 通过用户名查询权限信息
     * @param username
     * @return
     */
    public Set<String> getPermissions(String username);

}
