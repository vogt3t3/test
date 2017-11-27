package com.company.dao.repository;

import com.company.dao.pojo.User;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/18 0018.
 */
public interface UserRepository extends CrudRepository<User,Integer>{

}
