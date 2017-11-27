package com.company;

import com.company.dao.pojo.Student;
import com.company.dao.repository.StudentRepository;
import com.company.service.StudentService;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
public class StudentRepositoryTest extends TestCase {
    private ApplicationContext act;
    private StudentRepository studentRepository;
    private StudentService studentService;
    @Before
    public void setUp() throws Exception {
    act=new ClassPathXmlApplicationContext("applicationContext.xml");
        studentRepository= (StudentRepository) act.getBean("studentRepository");
        studentService= (StudentService) act.getBean("studentService");
    }

    @After
    public void tearDown() throws Exception {
    act=null;
    }

    @Test
    public void testFindByName() throws Exception {
    Student student=studentRepository.findByName("mary");
        System.out.println(student);
    }

    @Test
    public void testFindAllByNameContains() throws Exception {
    List<Student> list=studentRepository.findAllByNameContains("m");
        for(Student s:list){
            System.out.println(s);
        }
    }
    @Test
    public void testFindByNameStartingWithAndAgeGreaterThan() throws Exception{
        List<Student> list=studentRepository.findByNameStartingWithAndAgeGreaterThan("m",10);
        for(Student s:list){
            System.out.println(s);
        }
    }
    @Test
    public void testFindStudentByMaxId() throws Exception{
        Student s=studentRepository.findUserByMaxId();
        System.out.println(s);
    }
    @Test
    public void testFindStudentByStudentNameAge() throws Exception{
        List<Student> list=studentRepository.findStudentByStudentNameAge("mary",10);
        for(Student s:list){
            System.out.println(s);
        }
    }
    @Test
    public void testFindStudentByStudentNameAge2() throws Exception{
        List<Student> list=studentRepository.findStudentByStudentNameAge2("mary",10);
        for(Student s:list){
            System.out.println(s);
        }
    }
    @Test
    public void testFindStudentByName() throws Exception{
        List<Student> list=studentRepository.findByName1("m");
        for(Student s:list){
            System.out.println(s);
        }
    }
    @Test
    public void testFindCount() throws Exception{
        int count=studentRepository.getCounter();
        System.out.println(count);
    }
    @Test
    public void testService() throws Exception{
        studentService.updateStudent(1,"lily");
    }
}