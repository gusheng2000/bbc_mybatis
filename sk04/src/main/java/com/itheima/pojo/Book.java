package com.itheima.pojo;

import java.io.Serializable;

/**
 * @Author sc
 * @ClassName Book
 * @Description class function:
 * @Date 2022/11/21 10:44:26
 **/
public class Book implements Serializable {
    private  Integer id; //图书id
    private  String bookName;  //书名
    private  double price; //价格
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
