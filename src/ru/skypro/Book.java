package ru.skypro;

import java.util.Objects;

public class Book {
    private String title;
    private Author Author;
    private int year;

    public Book(String title, Author Author, int year) {
        this.title =title;
        this.year=year;
        this.Author=Author;
    }
     public String getTitle(){
        return title;
     }


    public Author getAuthor() {
        return Author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public String toString() {

        return "Назвиние книги - " + title + " " +  Author + ". год выпуска - " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title) && Author.equals(book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Author, year);
    }
}
