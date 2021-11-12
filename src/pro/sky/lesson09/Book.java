package pro.sky.lesson09;

import java.util.Objects;

public class Book {
    private Author author;
    private  String named;
    private int year;

    public Book(Author author, String named, int year) {
        this.author = author;
        this.named = named;
        this.year = year;
    }
    public Author getAuthor() {
        return author;
    }
    public String getAuthorName() {
        return author.getFirstName() + " " + author.getLastName();
    }

    public String getNamed() {
        return named;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Автор: " + getAuthorName() + " Название: " + getNamed() + " Год выпуска: " + getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(named, book.named);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, named, year);
    }
}



