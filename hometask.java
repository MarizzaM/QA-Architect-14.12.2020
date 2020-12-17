package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        1. write all numbers from -1000 to +1000 using do-while loop
        int num = -1000;
        do {
            System.out.print(String.format("%d ", num));
            num++;
        } while (num <= 1000);
        System.out.println();
//        2. read oreh,rohav,hekef from user until the hekef was 2*oreh+2*rohav using do-while loop
        int length, width, perimeter;
        do{
            System.out.print("Please enter length: ");
            length = scanner.nextInt();
            System.out.print("Please enter width: ");
            width = scanner.nextInt();
            System.out.print("Please enter perimeter: ");
            perimeter = scanner.nextInt();

        } while ( 2*width + 2*length != perimeter );
            System.out.println("Success!!!");
//        3. now solve targil 1,2 to using while(true)+break loop
        num = -1000;
        while (true){
            System.out.print(String.format("%d ", num));
            num++;
            if (num > 1000){
                System.out.println(" ");
                break;
            }
        }

        while (true){
            System.out.print("Please enter length: ");
            length = scanner.nextInt();
            System.out.print("Please enter width: ");
            width = scanner.nextInt();
            System.out.print("Please enter perimeter: ");
            perimeter = scanner.nextInt();
            if(2*width + 2*length == perimeter){
                System.out.println("Success!!!");
                break;
            }
        }
//       4. read temperature from user (float)
        float temperature;
        while (true){
            System.out.print("Please enter your temperature: ");
            temperature = scanner.nextFloat();
            if( temperature < 35 || temperature > 42){
                System.out.println("Error!!! Out of range");
                break;
            } else if (temperature > 35 && temperature <= 37.5){
                System.out.println("You are healthy! ");
                break;
            } else {
                System.out.println("You are sick...");
                break;
            }
        }
    }
}
