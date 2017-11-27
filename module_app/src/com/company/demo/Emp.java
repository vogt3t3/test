package com.company.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Created by Administrator on 2017/11/16 0016.
 */
public class Emp {
    private int empno;
    private BigDecimal sal;//format ctrl+alt+L
    private String ename;
    private LocalDate hiredate;//复制当前行 ctrl+d duplicate line or space
    //alt+InSert
    //ctrl+y ctrl+X delete/cut current line
    public Emp() {
    }
    //ctrl+shift+上下(在大括号内移动)
    //shift+F6 change name refresh
    //ctrl+shift+T create Junit code
    public Emp(int empno, BigDecimal sal, String ename, LocalDate hiredate) {
        this.empno = empno;
        this.sal = sal;
        this.ename = ename;
        this.hiredate = hiredate;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", sal=" + sal +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                '}';
    }
}
