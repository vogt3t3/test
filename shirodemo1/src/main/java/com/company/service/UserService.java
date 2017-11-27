package com.company.service;

import com.company.model.User;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Teacher XU on 2017/11/22 0022.
 */
public class UserService {

    public Set<String> getRoles(String username) {
        Set<String> roles = new HashSet<String>();
        System.out.println(username+" has roles:");
        roles.add("role1");
        roles.add("role2");
        roles.add("role3");
        return roles;
    }

    public Set<String> getPermissions(String username) {
        Set<String> permissions = new HashSet<String>();
        System.out.println(username+" has permissions:");
        permissions.add("user.*");
        permissions.add("teacher.findAll");
        permissions.add("student.save");
        permissions.add("student.update");
        permissions.add("student.delete");
        return permissions;
    }

    public User getByUsername(String username) {
        return new User(1001,username, "123456");
    }
}