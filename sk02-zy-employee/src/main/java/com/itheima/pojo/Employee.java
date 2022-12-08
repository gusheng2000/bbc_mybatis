package com.itheima.pojo;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String position;

    public Employee() {
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", POSITION='" + position + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPOSITION() {
        return position;
    }

    public void setPOSITION(String POSITION) {
        this.position = POSITION;
    }
}
