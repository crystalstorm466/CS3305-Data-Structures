//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 2 – Part 2 Factorial
package Assignment02;

import java.util.Scanner;

public class Part2Main {

    public static void recursiveFirstPass(int n, int max, int indent) {
        if (n <= max) {
            String indentString = String.format( "%" +indent + "s" + "");
            System.out.println(indentString + "This was written by call number " + n + ".");
            recursiveFirstPass(n + 1, max, indent + 3);
        }
    }

    public static void main(String[] args ) {
        System.out.println("[Recursion]");
        int n;
        System.out.println("What is n?: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        recursiveFirstPass(0, n, n);
    }

}
