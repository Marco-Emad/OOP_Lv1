package com.company;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double pound = input.nextDouble();
        System.out.print("Enter height in inches:");
        double inch = input.nextDouble();
        double kg = pound * 0.45359237;
        double cm = inch  * 0.0254;
        float bmi = (float) (kg/(cm*cm));
        System.out.println(bmi);
    }
}