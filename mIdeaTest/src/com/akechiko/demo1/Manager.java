package com.akechiko.demo1;

public class Manager {
    private String name;
    private String id;
    private int salary;
    private int bonus;

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

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("员工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经历正在努力做着管理工作，分配任务，检查员工提交上来的代码。。。");
    }
}
