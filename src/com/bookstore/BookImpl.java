package com.bookstore;

public class BookImpl {
    public static void main(String[] args){
        Author object = new Author();
        object.setAuthorName("abdul kalam");
        object.setAuthorPenName("chatak");
        Book object1 = new Book();
        object1.setDescription("motivator");
        object1.setIsbnNumber(123455);
        object1.setTitle("wings of fire");
        object1.setPrice(600);
        object1.display();
        //System.out.println("Book name = " + object1.getTitle());
        System.out.println("author name = " + object.getAuthorName());
        //System.out.println("Book description = " + object1.getDescription());
        System.out.println("author pen name = " + object.getAuthorPenName());
        //System.out.println("book isbn number = " + object1.getIsbnNumber());
       // System.out.println("book price = " + object1.getPrice());


    }
}
