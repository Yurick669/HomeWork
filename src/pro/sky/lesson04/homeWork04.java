package pro.sky.lesson04;

public class homeWork04 {
    public static void main(String[] args) {


        //Задание 1


        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            }
        int j = 10;
        while (j >=1) {
            System.out.println(j);
            j --;
        }

        //Задание 2
        int friday = 1;
        int month = 31;
        for (; friday <= month; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет!");
        }

        //Задание 3

        int i = 0;
        int year = 2021;
        for (; i <= year + 100;i = i + 79)
        if (i >= year - 200) {
            System.out.println(i);
        }
    }
 }
