package app;

import java.util.List;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private int pages;

    // Constructor, getters og evt. setters


    public Book(String title, String author, int publicationYear, double rating, int pages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = rating;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return title + ", " + author + "(" + publicationYear + ")," + rating + ", " + pages + " sider";
    }
}