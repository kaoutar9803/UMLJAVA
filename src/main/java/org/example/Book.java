package org.example;

public class Book {
    private String name;
    private String author;
    private int pageCount;

    public Book() {
        this.name = "";
        this.author = "";
        this.pageCount = 0;
    }

    public Book(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void displayBookInfo() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}
