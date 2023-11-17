//Name: David Holland
//Class: CS 3305/W02
//Term: Spring 2023
//Instructor: Carla McManus
//Assignment: 9-Part-2-AVL
package Assignment09;

import java.util.*;

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
        /*
        for (int i = 0; i < 100; i++) { //creates an AVL tree with dummy data
           //if you want some fun set i < 100 to 1 < signed 32 bit integer limit (2147483646)
            Random rand = new Random();
            int randInt = rand.nextInt(100);
            System.out.println(i);
            tree.insert(randInt);
        }

         */
        for (int i = 1; i <= 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please input an integer for index: " + i + ": ");
            int userint = scan.nextInt();
            tree.insert(userint);
            boolean isAVLTree = testAVLTree(tree, i);
            System.out.println(isAVLTree);
        }

//        for (int i = 0; i < tree.getSize(); i++) {
//            Random rand = new Random();
//            int randInt = rand.nextInt(tree.getSize() - 1);
//            tree.delete(randInt);
//            tree.preorder();
//            System.out.println();
//            randInt = rand.nextInt(5);
//            if (randInt < 3) {
//                break;
//            }
//        }

        System.out.println("Final Result: " + tree.isBalanced(tree.root));
    }

    private static boolean testAVLTree(AVLTree<Integer> tree, int i) {

        if (!tree.isBalanced(tree.root)) {
            System.out.println("Tree is not balanced after inserting: " + i);
            return false;
        } else {
            System.out.println("Tree is still balanced after inserting: " + i);
            //can't return here as the tree might get unbalanced soon
        }


        //deletion test
        for (int num : tree) {
            tree.delete(num);
            if (!tree.isBalanced(tree.root)) {
                System.out.println("Tree is not balanced after deleting: " + num);
                return false;
            } else {
                System.out.println("Tree is still balanced after deleting: " + num);
                //can't return here as the tree might get unbalanced soon

            }
        }
        return true; //if you make it here the tree is definitely balanced
    }




}
