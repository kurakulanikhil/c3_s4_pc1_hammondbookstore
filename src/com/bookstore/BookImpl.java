package com.bookstore;

public class BookImpl {
    public static void main(String[] args){
        Author author = new Author();
        author.setAuthorName("abdul kalam");
        author.setAuthorPenName("chatak");
        Book object1 = new Book();
        object1.setAuthor(author);
        object1.setDescription("motivator");
        object1.setIsbnNumber(123455);
        object1.setTitle("wings of fire");
        object1.setPrice(600);
        object1.display();

        //object1.setAuthor();
        //System.out.println("Book name = " + object1.getTitle());
        //System.out.println("author name = " + author.getAuthorName());
        //System.out.println("Book description = " + object1.getDescription());
        //System.out.println("author pen name = " + author.getAuthorPenName());
        //System.out.println("book isbn number = " + object1.getIsbnNumber());
       // System.out.println("book price = " + object1.getPrice());


    }
}
