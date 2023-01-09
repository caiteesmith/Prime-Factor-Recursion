/* Program: Prime Factor Recursion
Author: Caitlyn Smith
Course: CISS 111-300
Email: c-smith54@hvcc.edu

Description: Create a program which prompts the user for a number.
             The program then calculates the prime factors of that
             number using recursion. Search a given number for a
             factor that divides evenly into it, and then recurse
             with the remaining number after the division.

Prime Number: A whole number greater than 1 that cannot
              be made by multiplying other whole numbers
              Examples: 2, 3, 5, 7, 11, 13, 17, 19, 23

Factorization: Find which prime numbers multiply together
               to make the original number. */

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to factorize: ");
        int number = scan.nextInt();

        if (number < 2) {                                                        //Prime numbers are >= 2
            System.out.print("Please enter a number greater than 2: ");
            number = scan.nextInt();
        }

        System.out.println("\n– Prime factor tree for " + number + " –");        //Print factor tree for number
        primeRecursion(number);                                                  //Call recursive method
    }

    public static void primeRecursion(int number) {
        for (int n = 2; n <= number; n++) {                                      //Initialize with 2 (1 is a multiple)
            while (number % n == 0) {                                            //While number is divisible by 2
                System.out.println("A prime factor of " + number + " is: " + n); //Print number and its factor(s)
                number /= n;                                                     //Reduce/divide number by 2
                primeRecursion(number);                                          //Call recursive method
                return;
            }
        }
    }
}