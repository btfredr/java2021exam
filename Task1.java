/*
    Write a method that takes a integer value (x) as an argument and returns smallest odd number
    bigger than input number x.

    For exemple:
    For x= 25 the method returns 27
    For x= 34 the method returns 35
    For x= -7 the method returns -5
 */

public class Task1 {

   
    public static void main(String[] args) {
        
    }

    public static void smallestOdd(int x) {
        if (x % 2 == 0) {
            int y = x+1;
            System.out.print(y);
        } else {
            int z = x+2;
            System.out.print(z);
        }
    }

}