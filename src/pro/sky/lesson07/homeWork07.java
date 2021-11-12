package pro.sky.lesson07;

import java.time.LocalDate;

public class homeWork07{

    //Задание 1


    public static void main(String[] args) {
        leapYear(2021);
        device(1,2021);
        System.out.println("Дни доставки: " + distance(15));
        duplicate("idsaafs");
        int[] whatToFlip = {1,2,3,4,5,6,7,8,9};
        revers(whatToFlip);


    }

    //Задание1
    public static void leapYear(int year) {
        if (year % 4==0 && year % 100 !=0 || year % 400 == 0) {
                System.out.println(year + " - Високосный");
        } else {
            System.out.println(year + " - Не високосный");
        }
    }

    //Задание 2
    public static void device(int clientOS, int deviceYear){
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегчённую версию для iOS по ссылке:");
        } else if (deviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегчённую версию для Android по ссылке");
        } else if (deviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите стандартную версию приложения для iOS по сслылке");
        } else if (deviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        }

    }

    //Задание 3
    public static int distance(int deliveryDistance){
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    //Задание 4
    public static void duplicate(String text){
        char[] symbols = text.toCharArray();
        char previousCharacter = Character.MAX_VALUE;
        for (char symbol : symbols) {
            if (symbol == previousCharacter) {
                System.out.println("Есть дубль: " + symbol);
                return;
            }
            previousCharacter = symbol;
        }
        System.out.println("Дублей нет");
    }

    //Задание 5

    public static void revers(int[] revers){
        for (int i = revers.length - 1; i >= 0 ; i--) {
            System.out.print(revers[i]);
        }


    }

}




