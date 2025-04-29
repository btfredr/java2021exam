/*
    Write a Java program that transforms the temperature (input from user) in Celsius into temperature
    in Fahrenheit, using the formula f=9*c/5+32

    For example:
    if c is 0, the method returns 32
    if c is 10, the method returns 50
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Celcius temperature: ");   
        int celcius = scanner.nextInt();

        int formula = 9*celcius/5+32;

        scanner.close();

        System.out.print(formula);
    }
}
