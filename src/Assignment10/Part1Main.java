//Name: David Holland
//Class: CS 3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 10-Part-1-Hashing

package Assignment10;

import java.util.*;

public class Part1Main {
    public static void main(String[] args) {

        System.out.println("[Assignment 10 - Hashing]");
        Scanner scan = new Scanner(System.in);
        MyHashMap hashmap = new MyHashMap();
        for (int i = 0; i < 3; i++) { //test data created by the user
            System.out.print("What is the key?: (" + i + "): " );
            int key = scan.nextInt();
            System.out.print("What is the value?: (" + i + "): " );
            int value = scan.nextInt();
            hashmap.insertNode(key, value);
        }

        hashmap.display(); //prints out the map
        System.out.println(hashmap.sizeOfMap()); //prints out the size
        System.out.print("What key to delete?: ");
        int key = scan.nextInt();
        System.out.println("Node deleted: " + hashmap.deleteNode(key)); //Deletes the node using provided key
        System.out.println(hashmap.isEmpty()); //check to see if the map is empty
        System.out.print("What key to get?: ");
        key = scan.nextInt();
        System.out.println(hashmap.get(key)); //prints out the value of provided by user

    }
}
