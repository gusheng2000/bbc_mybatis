package com.itheima.pojo;

/**
 * @Author sc
 * @ClassName IdCard
 * @Description class function:
 * @Date 2022/11/7 10:33:25
 **/
public class IdCard {
    private Integer id;  //身份证id
    private String CODE;  //身份证号

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", code=" + CODE +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }
}
