package pro.sky.java.course1.lesson7.homework7;
import java.time.LocalDate;
import java.util.Arrays;

public class Homework7 {

    public static void main(String[] args) {

        task1(); // Задание 1
        task2(); // Задание 2
        task3(); // Задание 3
        task4(); // Задание 4
        task5(); // Задание 5
        task6(); // Задание 6

    }


    public static void task1() {

        int year = 2021;
        isYearLeap(year);
    }

    public static void isYearLeap(int year) {
        // Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void task2() {

        // ios = 0; android = 1;

        int clientOS = 1;
        int deviceYear = LocalDate.now().getYear();
        suggestOS(clientOS, deviceYear);

    }

    public static void suggestOS(int clientOS, int deviceYear) {

        if (clientOS == 1) {
            if (deviceYear > 2019) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (deviceYear > 2019) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        }
    }

    public static void task3() {
        int deliveryDistance = 95;

        System.out.println("Потребуется дней: " + countDaysQuantity(deliveryDistance));
    }

    public static int countDaysQuantity(int deliveryDistance) {
        int dayQuantity = 1;
        if (deliveryDistance >= 20) {
            dayQuantity += 1;
        }
        if (deliveryDistance >= 60) {
            dayQuantity += 1;
        }
        return dayQuantity;

    }

    public static void task4() {
        String str = "aabccddefgghiijjkk";
        checkDoubles(str);
    }

    public static void checkDoubles(String str) {
        char[] myArray = str.toCharArray();
        System.out.println("Исходная строка: " + str);
        String result = "";

        for (int i = 0; i < myArray.length-1; i++) {
            if (myArray[i] != myArray[i+1]) {
                    result = "Дубликатов нет";
                } else {
                    System.out.println("Есть дубликаты: " + myArray[i] + " ");
                return;
                }
        } System.out.println(result);
    }

    public static void task5() {
        int [] numbers = {3, 2, 1, 6, 5};
        reverseArray(numbers);

    }

    public static void reverseArray(int[] numbers) {
        String s = Arrays.toString(numbers);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }


    public static void task6() {
        int[] arr = generateRandomArray();
        countAverageSum(arr);

    }

    public static void countAverageSum(int[] arr) {
        double averageSum = 0;
        for (int j : arr) {
            averageSum = (averageSum + j) / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила: " + averageSum + " рублей.");

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}


