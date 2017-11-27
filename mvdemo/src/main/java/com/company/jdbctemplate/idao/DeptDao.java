package com.company.jdbctemplate.idao;


import com.company.jdbctemplate.pojo.Dept;

import java.util.List;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
public interface DeptDao {
    List<Dept> findAll() throws Exception;
    Dept findById(Integer deptno) throws Exception;
    void save(Dept dept)throws Exception;
    void update(Dept dept)throws Exception;
    void delete(Dept dept)throws Exception;

}
