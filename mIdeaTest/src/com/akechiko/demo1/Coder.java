package com.akechiko.demo1;

public class Coder {
    private String name;
    private String id;
    private int salary;
    public void work(){
        System.out.println("员工号为"+id+"基本工资为"+salary+"的程序员正在努力写着代码。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
