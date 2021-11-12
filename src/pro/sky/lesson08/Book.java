package pro.sky.lesson08;

public class Book {
    private  Author author;
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
}



