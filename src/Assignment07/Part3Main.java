//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 07-Part-3-Bonus-Trees
package Assignment07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part3Main {

    public static void main(String[] args) {
        System.out.println("[Morse Code and Binary Trees]");
        BinaryTree premadeBT = createPreMadeBT();
        BinaryTree morseCodeAlphabet = createBinaryTree();
        while(true) {
            System.out.println("1. Encode a message\n" +
                    "2. Decode a message\n" +
                    "3. Exit");
            System.out.print("Please select an option: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            scan.nextLine();
            //I could use a switch statement here but it's been a while since I used if statements
            if (choice == 1) { //encodeMessage
                System.out.println("What is your message?: ");
                String message = scan.nextLine();
                String encodedMessage = encodeMessage(message, morseCodeAlphabet);
                System.out.println("Your encoded message is: \n" + encodedMessage);
            } else if (choice == 2) { //decodeMessage
                System.out.println("What is your message?: ");
                String message = scan.nextLine();
                String decodedMessage = decodeMessage(message, morseCodeAlphabet);
                System.out.println("Your encoded message is: \n" + decodedMessage);
            } else if (choice == 3) { //Quit
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }

        }
    }


    public static String encodeCharacter(BinaryTree bt, char character) {
        StringBuilder encodedChar = new StringBuilder();
        character = Character.toUpperCase(character);
        Node currentNode = bt.getRoot();

        if (character == ' ' ) { return " "; }
        while (currentNode != null) {
            if (character == currentNode.getData()) {
                return encodedChar.toString(); //We are done
            } else if (character < currentNode.getData()) {
                encodedChar.append("."); //add a dot
                currentNode = currentNode.getLeft();
            }
            else {
                encodedChar.append("-"); //add a dash
                currentNode = currentNode.getRight();
            }
        }
        return ""; //if the character is not found
    }
    private static String encodeMessage(String message, BinaryTree morseCodeAlphabet) {
        StringBuilder encodedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char character = Character.toUpperCase(message.charAt(i));
            if (character == ' ') {
                encodedMessage.append(" "); // Add space for a space character
            } else {
                String encodedCharacter = encodeCharacter(morseCodeAlphabet, character);
                encodedMessage.append(encodedCharacter);
                encodedMessage.append(" "); // Add a space between encoded characters
            }
        }

        return encodedMessage.toString();
    }
    private static String decodeMessage(String message, BinaryTree morseCodeAlphabet) { //decodes the message
        StringBuilder encodedMessage = new StringBuilder(); //creates a new stringbuilder to store the decoded message
        for (int i = 0; i < message.length(); i++) {
            encodedMessage.append(decodeCharacter(message.charAt(i), morseCodeAlphabet)); //decodes the message
            encodedMessage.append(" ");
        }
        return encodedMessage.toString();
    }

    public static char decodeCharacter(char character, BinaryTree morseCodeAlphabet) {
       Node current = morseCodeAlphabet.getRoot(); //starts at the root of the tree

           if (character == '.') { //if the character is a dot, go left
               current = current.getLeft();
           } else if (character == '-') { //if the character is a dash, go right
               current = current.getRight();
           } else if (character == ' ') { //if the character is a space, return the current character
               char decodedCharacter = current.getData();
               current = morseCodeAlphabet.getRoot();
               return decodedCharacter;
           }
           return current.getData();
       }



    private static BinaryTree createBinaryTree() { //creates a morse code alphabet
        BinaryTree bt = new BinaryTree();
        bt.add('A');
        bt.add('.');
        bt.add('B');
        bt.add('-');
        bt.add('C');
        bt.add('-');
        bt.add('.');
        bt.add('-');
        bt.add('D');
        bt.add('-');
        bt.add('.');
        bt.add('.');
        bt.add('E');
        bt.add('.');
        bt.add('.');
        bt.add('.');
        bt.add('F');
        bt.add('.');
        bt.add('.');
        bt.add('-');
        bt.add('G');
        bt.add('-');
        bt.add('-');
        bt.add('H');
        bt.add('.');
        bt.add('.');
        bt.add('.');
        bt.add('.');
        bt.add('I');
        bt.add('.');
        bt.add('.');
        bt.add('J');
        bt.add('.');
        bt.add('-');
        bt.add('-');
        bt.add('-');
        bt.add('K');
        bt.add('-');
        bt.add('.');
        bt.add('L');
        bt.add('.');
        bt.add('-');
        bt.add('-');
        bt.add('M');
        bt.add('-');
        bt.add('-');
        bt.add('N');
        bt.add('-');
        bt.add('O');
        bt.add('-');
        bt.add('-');
        bt.add('-');
        bt.add('P');
        bt.add('.');
        bt.add('-');
        bt.add('-');
        bt.add('Q');
        bt.add('-');
        bt.add('-');
        bt.add('.');
        bt.add('R');
        bt.add('.');
        bt.add('-');
        bt.add('S');
        bt.add('.');
        bt.add('.');
        bt.add('.');
        bt.add('T');
        bt.add('-');
        bt.add('.');
        bt.add('.');
        bt.add('U');
        bt.add('.');
        bt.add('.');
        bt.add('-');
        bt.add('V');
        bt.add('.');
        bt.add('-');
        bt.add('-');
        bt.add('W');
        bt.add('.');
        bt.add('-');
        bt.add('-');
        bt.add('X');
        bt.add('-');
        bt.add('.');
        bt.add('-');
        bt.add('Y');
        bt.add('-');
        bt.add('.');
        bt.add('.');
        bt.add('Z');
        bt.add('-');
        bt.add('-');
        bt.add('-');


        return bt;
    }

    private static BinaryTree createPreMadeBT()  { //creates a morse code alphabet based off test files provided
        BinaryTree bt = new BinaryTree();
        try { //reads the file provided and inputs into a Binary tree
            File mergeTest = new File("src/Assignment07/morse.txt");
            Scanner filescanner = new Scanner(mergeTest);
            while (filescanner.hasNextInt()) {
                int data = filescanner.nextInt();
                System.out.println(data);
               // bt.add(data);
            }
            filescanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bt;
    }
}

class Node {
    //implementing the objects used for binary trees
    char character;
    Node left, right;

    Node(char character) {
        this.character = character;
        right = null;
        left = null;
    }

    public Node getLeft() { return left; }
    public Node getRight() { return right; }
    public char getData() { return character; }

}

class BinaryTree {
    //implementing a binary tree in Java
    Node root;

    private Node add(Node current, char character) { //adds a new node to the tree or add new elements to the "binary tree"
        if (current == null) { return new Node(character); }
        if (character < current.character) { //adds the new node to the left if it is less than the current node
            current.left = add(current.left, character);
        } else if (character > current.character) { //adds the new node to the right if it is greater than the current node
            current.right = add(current.right, character);
        } else { //value already exists
            return current;
        }


        return current;
    }

    public void add(char character) { root = add(root, character); } //adds a new node to the tree


    public Node getRoot() {
        return root;
    }
}