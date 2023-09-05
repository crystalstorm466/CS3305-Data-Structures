//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Assignment: 3 – Part 1 Iterator
package Assignment03;

import java.util.*;

public class Part1Main {

    public static LinkedList<Integer> IntegerLinkedList = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 4, 5, 6, 7)); //prefill list with all the given data
//    public static void printRange(int x, int y) {
//        for (int i = x; i < y; i++) {
//            if (IntegerLinkedList.get(i) == x) {
//                if (!(IntegerLinkedList.get(i + 1) == y) ) { //checks if value after i is equal to y
//                    for (int e = x; i < IntegerLinkedList.size(); i++) { //if so print everything after x and end the loop
//                        System.out.println(IntegerLinkedList.get(e) + " ");
//                    }
//                    break;
//                }
//                continue;
//            }
//            System.out.print(IntegerLinkedList.get(i) + " ");
//        }
//    }

    public static void printRange(int x, int y) {
        boolean foundX = false;

        for (int num : IntegerLinkedList) {     // Iterate through each element in IntegerLinkedList.
            if (num == x) {
                foundX = true;
                //continue; this was here but it made x not print
            }

            if (foundX) {         // If 'x' has been found or if we've already iterated past 'x', print the current element.
                System.out.println(num + " ");
                if (num == y - 1) {
                    break;
                }
            }
        }
        System.out.print(" ");
    }


    public static void removeRepetitions() {
        ListIterator<Integer> iterator = IntegerLinkedList.listIterator(); //setup counter to traverse through the linkedlist
        Integer previous = null; //sets previous to a null value for a placeholder
        while (iterator.hasNext()) { //while there is still other values in the list
            int current = iterator.next();
            if (previous != null && current == previous) { //check for duplicates if so then remove the current index.
                iterator.remove();
            } else { previous = current; } //move to next
        }
    }
    public static void main(String[] args) {
        System.out.println("[Linked List Iterator Assignment 03]");
   /* wrote this menu out to give the user the option to input test data.
        while(true) {
            System.out.print("Please enter an x: ");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            System.out.print("Please enter a y: ");
            int y = scan.nextInt();
            removeRepetitions();
            printRange(x,y);
            System.out.print("Would you like to quit? (Y/N): ");
            String quit = scan.next();
            if (quit.equalsIgnoreCase("y")) { System.exit(0); }
        }
     */
        int x = 8;
        int y = 5;
        removeRepetitions();
        printRange(x, y);
    }

}
