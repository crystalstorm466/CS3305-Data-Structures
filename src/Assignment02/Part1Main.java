//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 2 – Part 1 Factorial



/* Psuedocode

     void main {
            print("What is n?: ")
            int n
            n = USERINPUT
            print("The factorial of " + n + " is: + "factorial(n))
     }

     int factorial(int n) {
           if n == 0 { return 1;
           } else {
                 return ( n MULT factorial(n-1));
            }


P.S as I was writing this pseduocode I realize that after writing it I just wrote the whole thing in Java.
I failed at writing Pseduocode by just writing Java...
 */
package Assignment02;

import java.util.Scanner;

public class Part1Main {
    public static void main(String[] args) {
        System.out.print("What is n?: ");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println("The factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }
}
