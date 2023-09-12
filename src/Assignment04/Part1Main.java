//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Assignment: 4 – Part 1 Stacks
package Assignment04;

import java.util.*;

public class Part1Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How big do want the array?: ");
        int size = scan.nextInt();
        CustomStack<Integer> twoStacks = new CustomStack<>(size);

        System.out.println("[Custom Stacks]");
        System.out.println("Please input 5 values for Stack A and B");
        for (int i = 0; i < size; i++) {
            System.out.print("(Stack A) Please print " + i + "'s value: ");
            twoStacks.pushA(scan.nextInt());
            System.out.print("(Stack B) Please print " + i + "'s value: ");
            twoStacks.pushB(scan.nextInt());


        }
        System.out.println("The contents of Stack A are: ");
        while (!twoStacks.isEmpty_a()) {
            System.out.println("Stack A has been popped! Popped value: " + twoStacks.popA());
        }
        System.out.println("______________________________");
        System.out.println("The contents of Stack B are: ");

        while (!twoStacks.isEmpty_b()) {
            System.out.println("Stack B has been popped! Popped value: " + twoStacks.popB());
        }

    }



}

