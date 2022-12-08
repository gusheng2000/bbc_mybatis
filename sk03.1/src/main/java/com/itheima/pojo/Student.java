package com.itheima.pojo;

/**
 * @Author sc
 * @ClassName Student
 * @Description class function:
 * @Date 2022/11/1 16:06:37
 **/
public class Student {
    private  String id; //id
    private  String name;  //姓名
    private  String major;  //专业名称
    private  String stuId;  //学号

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", stuId='" + stuId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
}
