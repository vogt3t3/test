package com.company.service;

import com.company.dao.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/11/18 0018.
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Transactional
    public void updateStudent(Integer id,String name){
        System.out.println("update in service");
        studentRepository.updateName(id, name);
    }
}
