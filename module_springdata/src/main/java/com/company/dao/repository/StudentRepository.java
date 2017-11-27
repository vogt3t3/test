package com.company.dao.repository;


import com.company.dao.pojo.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
public interface StudentRepository extends Repository<Student,Integer> {
    public Student findByName(String name);
    public List<Student> findAllByNameContains(String name);
    public List<Student> findByNameStartingWithAndAgeGreaterThan(String name,Integer age);
    @Query("select s2 from Student s2 where id =(select max(id) from Student s1)")
    public Student findUserByMaxId();
    @Query("select s from Student s where s.name=?1 and s.age>?2")
    public List<Student> findStudentByStudentNameAge(String name,int age);
    @Query("select s from Student s where s.name=:name and s.age>:age")
    public List<Student> findStudentByStudentNameAge2(@Param("name") String name,@Param("age") int age);
    @Query("select s from Student s where s.name like %?1%")
    public List<Student> findByName1(String name);
    @Query(nativeQuery = true,value="select count(*) from student")
    public  int getCounter();
    @Modifying
    @Query("update Student s set s.name=:name where s.id=:id")
    public void updateName(@Param("id") Integer id,@Param("name") String name);
}
