package com.company.bookhouse;


public class Book {

    private String author;
    private String genre;
    private String title;
    private int edition;

    public Book(String author, String genre, String title, int edition) {
        this.author = author;
        this.genre = genre;
        this.title = title;
        this.edition = edition;
    }

    public Book(String author) {
        this.author = author;
    }

    public void aboutYourself() {
        System.out.printf(" | Автор : " + author + " | Жанр : " + genre + " | Название : " + title + " | Год выпуска : " + edition);
    }

    public boolean trueAuthor(String author) {
        return this.author.equals(author) ;
    }
    public boolean trueGenre(String genre){
        return this.genre.equals(genre);
    }
    public boolean isPublisheInPeriod(int a, int b){
        if (this.edition > a & this.edition < b) return true ;

       return false;
    }
}
