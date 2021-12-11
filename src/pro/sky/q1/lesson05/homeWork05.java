package pro.sky.q1.lesson05;

import java.util.Arrays;
import java.util.Random;

public class homeWork05 {
    public static void main(String[] args) {

        // Задача 1
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(Arrays.toString(arr));

        int expenses = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            expenses = expenses + sum;
        }
        System.out.println("Сумма трат за месяц составила " + expenses + " рублей");


        //Задача 2

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum < min) {
                min = sum;
            } else if (sum > max){
                max = sum;
            }
        }
        System.out.println("Минимальная сумма затрат составила " + min + " рублей");
        System.out.println("Максимальная сумма затрат составила " + max + " рублей");

        //Задание 3
        float sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            sum1 = sum1 + sum;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (sum1/ arr.length) + " рублей");


        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

}

