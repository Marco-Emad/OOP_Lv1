package com.company;
import java.util.Scanner;

public class MultipyNums {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int num = input.nextInt();
        int n = num % 10;
        num = num / 10 ;
        int sum = 1 ;
        sum = sum * n ;
        n = num % 10;
        num = num / 10 ;
        sum = sum * n ;
        n = num % 10;
        num = num / 10 ;
        sum = sum * n;
        System.out.print(sum);
    }
}