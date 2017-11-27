package com.shiro.service.iservice;

import com.shiro.pojo.User;

import java.util.Set;


public interface UserService {
	/**
	 * 获得用户
	 * @param username
	 * @return
	 */
	public User getByUsername(String username);

	/**
	 * 获得角色
	 * @param username
	 * @return
	 */
	public Set<String> getRoles(String username);

	/**
	 * 获得权限
	 * @param username
	 * @return
	 */
	public Set<String> getPermissions(String username);
}
