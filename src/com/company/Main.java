package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру, количество которой нужно посчитать:");
        int digit = sc.nextInt();
        char digitToChar = (char) (digit + 48);
        System.out.println("Ведите число, которое будет служить диапазоном, в котором будем считать:");
        int numberOfInteger = sc.nextInt();
        int number = 0;
        int counter = 0;
        sc.close();

        for(int i = 1; i <= numberOfInteger; i++) {
            int firsTimeDigit = 0;
            char [] numberOfIntegerToChar = Integer.toString(i).toCharArray();
            for(int j = 0; j < numberOfIntegerToChar.length; j++) {
                if (digitToChar == numberOfIntegerToChar[j] && (firsTimeDigit == 0)) {
                   counter += 1;
                   firsTimeDigit++;
                }
            }
        }

        System.out.println("Цифра - " + digit + " появляется в диапазоне от 1 до " + numberOfInteger + " - " + counter + " раз");
    }
}
