package pro.sky.q1.lesson09;

public class homeWork09 {

    public static void main(String[] args) {

        Author tolkien = new Author("John", "Tolkien");
        Author tolkien2 = new Author("John","Tolkien");
        Author king = new Author("Stephen", "King");

        Book theLordOfTheRings = new Book(tolkien, "The Lord of the Rings", 1954);
        Book battleground = new Book(king, "Battleground", 1978);

        System.out.println(theLordOfTheRings);
        System.out.println(battleground);

        theLordOfTheRings.setYear(2000);
        System.out.println("Новое издание " + theLordOfTheRings);


        System.out.println("Проверка 1: " + tolkien.equals(tolkien2));
        System.out.println("Проверка 1.1: " + (tolkien.hashCode() == tolkien2.hashCode()));
        System.out.println("Проверка 2: " + tolkien.equals(king));
        System.out.println("Проверка 2.1 " + (tolkien.hashCode() == king.hashCode()));

    }

}
