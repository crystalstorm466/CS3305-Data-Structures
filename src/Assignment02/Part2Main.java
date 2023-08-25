//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 2 – Part 2 Factorial
package Assignment02;

import java.util.Scanner;

public class Part2Main {

    public static void recursiveFirstPass(int n, int currentCall, int maxIndent) {
        if (n <= 0)  return;

//            String indentString = String.format(" ", 4 * (maxIndent - n));
        String indentString = " ".repeat(maxIndent - n);
            System.out.println(indentString + "This was written by call number " + currentCall);

            recursiveFirstPass(n - 1, currentCall + 1, maxIndent);
            System.out.println(indentString + "This was ALSO written by call number " + currentCall);

    }


    public static void main(String[] args ) {
        System.out.println("[Recursion]");
        int n;
        System.out.println("What is n?: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int maxIndent = 3 * (n - 1);
        recursiveFirstPass(n, 1, maxIndent);
    }

}
