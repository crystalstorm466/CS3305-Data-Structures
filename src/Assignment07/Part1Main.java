//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 07-Part-1-Sorting
package Assignment07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.LinkedList;

public class Part1Main {
    public static void main(String[] args) {
        linkedList preSort = new linkedList();
        try { //reads the file provided and inputs into a linkedlist to be read
            File mergeTest = new File("src/Assignment07/mergetest.txt");
            Scanner filescanner = new Scanner(mergeTest);
            while (filescanner.hasNextInt()) {
                int data = filescanner.nextInt();
                System.out.println(data);
                preSort.push(data);
            }
            filescanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        preSort.head = preSort.mergeSort(preSort.head); //sorts the list starting from top of list
        System.out.println("Sorted Linked List is:");
        preSort.printList(preSort.head); //prints the sorted list

    }


}
