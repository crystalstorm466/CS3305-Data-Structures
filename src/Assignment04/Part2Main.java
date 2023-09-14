//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Assignment: 4 – Part 2 Palindromes
package Assignment04;

import java.util.*; //simplifies instead of using 2 lines

public class Part2Main {

    public static void main(String[] args ) {
        System.out.println("[Palindromes]");

        Scanner scan = new Scanner(System.in);
        System.out.print("What is the original string?: ");
        /* using the power of bing I have come up with a list of palindromes to test:
            1. radar
            2. civic
            3. level
            4. racecar
            5. noon
            6. kayak
            7. rotator
            8. madam
            9. deed
            10. refer
            11. tacocat

         */
        String ogString = scan.next().toLowerCase(); //sets the user string to lowercase to ensure a fair test

        Stack<String> stack1 = new Stack<>(); //original string but will become empty
        Stack<String> stack2 = new Stack<>(); //original string
        Stack<String> stack3 = new Stack<>(); //reversed string


        for (int i = 0; i < ogString.length(); i++) {
            stack1.push(String.valueOf(ogString.charAt(i))); //goes through the string and pushes each character to each stack
            stack2.push(String.valueOf(ogString.charAt(i)));
        }

        while (!(stack1.isEmpty())) { //until the stack is empty stack1 will be continuously popped and pushed to stack3
            String letter = stack1.pop();
            stack3.push(letter);
        }


        int score = 0;
        for (int i = 0; i < stack2.size(); i++ ) { //goes through stack2 and compares each index with stack 3
            if (stack2.get(i).equals(stack3.get(i))) { //we do not need equalsignorecase() as the cases will be the same: lowercase
                score++; //keeps track of correct letters
            }
        }

        if (score == stack3.size()) {
            System.out.println("The string: " + ogString + " is a palindrome.");
        } else {
            System.out.println("The string: " + ogString + " is not a palindrome.");

        }
    }
}
