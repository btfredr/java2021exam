/*
    Write a method that takes integer number n as an argument. After that, it checks if n is odd or even.
    In the case its even, the program should use a while loop to write 5 subsequent even numbers. In
    the case it is odd, the program should multiply number n with 25, and write a result.
    E.g. 1: for n = 6, the program should write: 8,10,12,14,16
    E.g. 2: for n = 7, the program should write: 175
 */


public class Task3 {
    public static void main(String[] args) {
        oddOrEven(6);
        oddOrEven(7);
    }

    public static void oddOrEven(int n) {
        if (n % 2 == 0) {

            int count = 0;
            int current = n + 2;

            while(count < 5) {
                System.out.println(current + " ");
                current += 2;
                count++;
            }
        } else {
            int multiply = n * 25;
            System.out.print(multiply);
        }
    }
}
