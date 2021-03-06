package model.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private static int nextId = 0;
    private int id;
    private String title;
    private String author;
    private String publish;
    private int year;
    private int pages;
    private double price;

    {        this.id = nextId++;    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublish() {
        return publish;
    }
    public void setPublish(String publish) {
        this.publish = publish;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("author:%-15s title:%-25s publish:%-15s year:%-5d " +
                        "pages:%-5d cost:%-7.2f", author, title, publish, year,
                pages, price);
    }

    public Book() {    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String publish, int year,
                int pages, double price) {
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
