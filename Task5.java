/*
    Write a Java program that shows a message about number of digits and letters in a String using the
    method:
    public void printNumberOfDigitsAndLetters(String input){}

    E.g. 1: if the input is: “I am 25 years old”, the method should print:
    The line contains 2 digits and 11 letters!
 */

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String userInput = scanner.nextLine();

        scanner.close();

        printNumbersOfDigitsAndLetters(userInput);
    }
    
    public static void printNumbersOfDigitsAndLetters(String input) {
        int digitCount = 0;
        int letterCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letterCount++;
            } else if (Character.isDigit(input.charAt(i))) {
                digitCount++;
            }
        }

        System.out.print("The line contains " + digitCount + " digits, and " + letterCount + " letters!");

    }
}
