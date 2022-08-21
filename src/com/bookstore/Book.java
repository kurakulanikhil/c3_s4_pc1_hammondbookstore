package com.bookstore;

public class Book {
    private long isbnNumber;
    private String title;
    private String description;
    private double price;
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.println("book isbn number = " + isbnNumber);
        System.out.println( "book title = "+ title);
        System.out.println("book description = " + description);
        System.out.println("book price = " + price);
        System.out.println( author);

    }

}
