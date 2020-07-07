package com.company;
import java.util.Scanner;

public class Ping {

    public static void main(String[] args) {
	   Scanner input  = new Scanner(System.in);
	   System.out.print("Enter a number in square meters");
	   double meter = input.nextDouble();
	   double ping = meter * 0.3025;
	   System.out.println( meter + " square meters is " + ping + " pings ");
    }
}
