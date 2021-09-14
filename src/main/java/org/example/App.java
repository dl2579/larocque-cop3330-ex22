package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the first number: " );
        int num1 = sc.nextInt();

        System.out.print( "Enter the second number: " );
        int num2 = sc.nextInt();

        System.out.print( "Enter the third number: " );
        int num3 = sc.nextInt();

        if(num1 == num2 || num1 == num3 || num2 == num3){
            System.exit(0);
        }

        int largest = num1;
        if(num2 > largest){
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;
        }

        System.out.printf("The largest number is %d.%n", largest);

    }
}
