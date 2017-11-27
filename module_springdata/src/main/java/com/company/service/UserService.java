package com.company.service;

import com.company.dao.pojo.User;
import com.company.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/11/18 0018.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Transactional
    public void saveUsers(List<User> users){
        userRepository.save(users);
    }
}
