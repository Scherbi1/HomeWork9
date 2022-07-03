package ru.skypro;

public class Book {
    private String title;
    private Author Author;
    private int year;

    public Book(String title, Author Author, int year) {
        this.title =title;
        this.year=year;
    }
     public String getTitle(){
        return title;
     }


    /*public Author getAuthor() {
        return Author;
    }*/

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
