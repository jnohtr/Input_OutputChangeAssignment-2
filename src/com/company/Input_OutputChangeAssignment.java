package com.company;

import java.util.Scanner;
public class Input_OutputChangeAssignment {

    public static void main(String[] args) {
	// write your code here hey what'sgoin on? don worri
        Scanner keyboard = new Scanner(System.in);

        //int num1, num2, num3;
        double num1, num2, num3, avg;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();

        avg = ( num1 + num2 ) /2 ;

        System.out.println("The max value is : " + Math.max(num1, num2));

        System.out.println("average is : " + avg );
    }
}
