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
        boolean leapYear = isYearLeap(year);
        printIfYearIsLeapResult(year, leapYear);
    }

    public static boolean isYearLeap (int year) {
        return year % 4 == 0 || year % 100 != 0 && year % 400 == 0;

    }

    public static void printIfYearIsLeapResult(int year, boolean leapYear) {
        if (leapYear){
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }

    }


    public static void task2() {

        // ios = 0; android = 1;

        int clientOS = 1;
        int deviceYear = 2021;
        int currentYear = LocalDate.now().getYear();
        suggestOS(clientOS, currentYear, deviceYear);

    }

    public static void suggestOS(int clientOS, int currentYear, int deviceYear) {

        if (clientOS == 1) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
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
            dayQuantity ++;
        }
        if (deliveryDistance >= 60) {
            dayQuantity ++;
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
            if (myArray[i] == myArray[i+1]) {
            System.out.println("Есть дубликаты: " + myArray[i] + " ");
            return;
            }
        } System.out.println("Дубликатов нет");

    }

    public static void task5() {
        int [] numbers = {3, 2, 1, 6, 5};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("Итоговый массив: " + Arrays.toString(numbers));

    }

    public static void reverseArray(int[] numbers) {
        int head = 0;
        int tail = numbers.length-1;

        while (head < tail) {
            int temp = numbers[head];
            numbers[head++] = numbers[tail];
            numbers[tail--] = temp;
        }
    }


    public static void task6() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(generateRandomArray()));
        double averageSum = calculateAverageSumFrom(arr);
        System.out.println("Средняя сумма трат составила: " + averageSum);

    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;

    }

    public static double calculateAverageSumFrom(int [] arr) {
        int sum = calculateSum(arr);
        return calculateAverageSum(sum, arr.length);
    }

    public static double calculateAverageSum (int sum, int elementsAmount) {
        return sum / (double) elementsAmount;
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}


