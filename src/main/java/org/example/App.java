/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int n1, n2, n3;
        int largest_num = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.print("Enter the third number: ");
        n3 = input.nextInt();

        if(n1 == n2 || n1 == n3 || n2 == n3)
        {
            return;
        }

        if(n1 > n2 && n1 >n3)
            largest_num = n1;
        else if(n2 > n1 && n2 > n3)
            largest_num = n2;
        else if( n3 > n1 && n3 > n2)
            largest_num = n3;

        System.out.printf("The largest number is %d.", largest_num);
    }
}