package com.codegym.money;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("press 1 to convert VND to USD");
        System.out.println("press 2 to convert USD to VND");
        int number = scanner.nextInt();
        double vnd;
        double usd;
        switch (number) {
            case 1:
                System.out.println("enter VND");
                vnd = scanner.nextDouble();
                usd = vnd / 23000;
                System.out.println("USD : " + usd);
                break;
            case 2:
                System.out.println("enter USD");
                usd = scanner.nextDouble();
                vnd = usd * 23000;
                System.out.println("VND : " + vnd);
                break;
            default:
                System.out.println("no choice");
        }
    }
}