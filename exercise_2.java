package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studend = 1;
        int sum = 0;
        int super_student = 0;
        int grade;
        do {
            System.out.println(String.format("Please enter grade for student %d ...", studend));
            grade = scanner.nextInt();
            if (grade > 100 || grade < 0){
                System.out.println("Error!!!");
                break;
            }
            if (grade == 100){
                super_student = super_student + 1;
            }
            if (super_student == 5){
                System.out.println("This is super class");
                break;
            }
            sum = sum + grade;
            studend++;
        }
        while (studend <= 10);

        System.out.println("average: " + sum/10);
    }
}
