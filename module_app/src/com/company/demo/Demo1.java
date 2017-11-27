package com.company.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/16 0016.
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Date date=new Date();
        System.out.println(date);
        LocalDate ld=LocalDate.now();
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
    }

}
