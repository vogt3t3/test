package com.company.jdbctemplate.impl;

import com.company.jdbctemplate.idao.DeptDao;
import com.company.jdbctemplate.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
@Repository("deptDao")
public class DeptImpl implements DeptDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Dept> findAll() throws Exception {
        String sql="select deptno,dname,loc from dept";
        List<Dept> list=new ArrayList<Dept>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Dept dept=new Dept(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
                list.add(dept);
            }
        });
        return list;
    }

    @Override
    public Dept findById(Integer deptno) throws Exception {
       String sql="select deptno,dname,loc from dept where deptno=?";
        List<Dept> list=new ArrayList<Dept>();
       jdbcTemplate.query(sql, new Object[]{deptno}, new RowCallbackHandler() {
           @Override
           public void processRow(ResultSet resultSet) throws SQLException {
              Dept  d=new Dept(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
               list.add(d);
           }
       });
        return list.get(0);
    }

    @Override
    public void save(Dept dept) throws Exception {

    }

    @Override
    public void update(Dept dept) throws Exception {

    }

    @Override
    public void delete(Dept dept) throws Exception {

    }
}
