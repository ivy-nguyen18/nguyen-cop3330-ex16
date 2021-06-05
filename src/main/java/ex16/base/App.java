/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex16.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();

        String output = (age>=16)? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(output);
    }
}
