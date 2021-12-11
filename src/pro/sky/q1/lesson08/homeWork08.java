package pro.sky.q1.lesson08;

public class homeWork08 {

    public static void main(String[] args) {

        Author tolkien = new Author("John", "Tolkien");
        Author king = new Author("Stephen", "King");

        Book theLordOfTheRings = new Book(tolkien, "The Lord of the Rings", 1954);
        Book battleground = new Book(king, "Battleground", 1978);

        System.out.println(theLordOfTheRings);
        System.out.println(battleground);

        theLordOfTheRings.setYear(2000);
        System.out.println("Новое издание " + theLordOfTheRings);



    }

}
