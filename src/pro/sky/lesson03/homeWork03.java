package pro.sky.lesson03;

public class homeWork03 {
    public homeWork03() {
    }

    public static void main(String[] args) {

        //Задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите приложение для Android по ссылке");
        }

        //Задание 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегчённую версию для iOS по ссылке:");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите стандартную версию приложения для iOS по сслылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установиде стандартную версию приложения для Android по ссылке");
        }


        //Задание 3
        int year = 2021;
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println(year + " Год не является високосным");
        } else {
            System.out.println(year + " Год является високосным");
        }

        //Задание 4
        int deliveryDistance = 100;
        int takeDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Даставка займёт " + takeDays + " день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Даставка займёт " + (takeDays + 1) + " дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("Даставка займёт " + (takeDays + 2) + " дня");
        }

        //Задание 5
        int monthNumber = 13;
        switch(monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого дня не существует");
        }
    }
}
