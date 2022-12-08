package com.itheima.pojo;

/**
 * @Author sc
 * @ClassName Person
 * @Description class function:
 * @Date 2022/11/7 10:34:42
 **/
public class Person {
    private Integer id;   //人员id
    private String name;   //人员姓名
    private Integer age;  //年龄
    private String sex;  //性别
    private IdCard card;  //人员对应的身份证

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", card=" + card +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }
}
