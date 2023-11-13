//Name: David Holland
//Class: CS 3305/W02
//Term: Spring 2023
//Instructor: Carla McManus
//Assignment: 9-Part-2-AVL
package Assignment09;

import java.util.Random;

public class Part2Main {
    public static void main(String[] args) {

        //Tree.java, AbstractTree.java, and BST.java were all taken from the textbook as instructed
        //AVLTree.java - Code to build the tree was taken from the textbook however the balancing checks were handwritten.

        //AVL tree criteria: (freecodecamp.org)
        // 1. Each tree has a root node (at the top)
        // 2. The root node has a 0, 1, or 2 child nodes
        // 3. Each child has 0, 1, or 2 child nodes
        // 4. Each node has up to 2 children
        // 5. For each node , its left descendants are less than the current node, which is less than the right descendants
        System.out.println("[Assignment 9 - AVL Trees]");
        AVLTree<Integer> tree = new AVLTree<>();
        for (int i = 0; i < 3; i++) { //creates an AVL tree with dummy data
            Random rand = new Random();
            int randInt = rand.nextInt(100);
            tree.insert(randInt);
        }


        System.out.println(tree.isBalanced(tree.root));
    }


}
