package org.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int sum = (number / 100) + (number / 10 % 10) + (number % 10);

        System.out.println("Сумма цифр числа: " + sum);
    }
}
