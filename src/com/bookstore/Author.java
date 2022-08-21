package com.bookstore;

public class Author {
    private String authorName;
    private String authorPenName;


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }


    @Override
    public String toString() {
        //return authorName "name = vaibhav" + ", \n" + authorPenName;
        return "Author Name = " + authorName + "\nAuthor Pen Name = " + authorPenName;



    }
}

