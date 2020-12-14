package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 1;
        do {
            System.out.print(String.format("%d ", num));
            num++;
        }
        while (num <= 100);

        System.out.println(" ");
        int a, b, c;
        do {
            System.out.println("Please enter a, b, c: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }
        while ( a+b == c);

        System.out.println(" ");
        do {
            System.out.println("Please enter dif a, b, c: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }
        while ( a!=b && a!=c && b!=c);
    }
}
