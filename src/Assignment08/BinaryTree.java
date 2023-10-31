//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 08-BTs
package Assignment08;


class Node { // Node class
    //Objects for the Binary Tree
    double data; //Chose double as all of the test data except the first one is a double
    Node left, right;
    Node (double data) {
        this.data = data;
        left = right = null;
    }

 }
public class BinaryTree {


    int preIndex = 0;


    Node root; //bottom most of tree

    Node buildTree(double in[], double[] pre, int inStart, int inEnd) { //builds the tree based off the pre and in order traversals from test data
        //BuildTree, search, and printInorder were taken from https://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/
        //^^^ above comment was made with Github Copilot it knew the url I didn't even type that. That's amazing.
        //However build tree orignally was built for chars and I modified it to work with doubles.

        if (inStart > inEnd) {
            return null;
        }

        Node tempNode = new Node(pre[preIndex++]); //creates a new node based of

        if (inStart == inEnd) {
            return tempNode;
        }

        int inIndex = search(in, inStart, inEnd, tempNode.data);

        tempNode.left = buildTree(in, pre, inStart, inIndex - 1); //recursively builds the left side of tree
        tempNode.right = buildTree(in, pre, inIndex + 1, inEnd);  //recursively builds the right side of tree

        return tempNode;
    }

    int search(double arr[], int strt, int end, double value) { //searches for the value in the array used for inIndex in buildTree
        for (int i = strt; i <= end; i++) { //loops through the array until index is found
            if (arr[i] == value) {
                return i;
            }
            return i;
        }
        return 0;
    }
    void printInorder(Node node) //
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    int depth(Node root) { //finds the depth of the tree; AKA how deep the tree goes
        if (root == null) {
            return -1;
        } else {
            int leftDepth = depth(root.left);
            int rightDepth = depth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
    public double max (Node root) { //Finds the max value of a node in the tree by checking each node.
        if (root == null) { return -1; }
        double maxVal = root.data;
        if (root.left != null) {
            maxVal = Math.max(maxVal, max(root.left));
        }
        if (root.right != null) {
            maxVal = Math.max(maxVal, max(root.right));
        }
        return maxVal;
    }

    public int tree_count(Node root) { //counts the number of nodes in the tree
        if (root == null) { return 0; }
        return 1 + tree_count(root.left) + tree_count(root.right);
    }
    public double tree_sum(Node root) { //adds up all the nodes' values
        if (root == null) {
            return 0;
        }
        return root.data + tree_sum(root.left) + tree_sum(root.right);
    }


    public double tree_average(Node root) { //finds the average of the nodes
        if (root == null) { return 0; }
        int count = tree_count(root);
        return tree_sum(root) / count;
    }

    public boolean tree_is_balanced(Node root ) { //checks if the tree is balanced
        if (root == null) {
            return true;
        }
        int leftDepth = depth(root.left); //gets the depth of the left side of the tree
        int rightDepth = depth(root.right); //gets the depth of the right side of the tree

        if (Math.abs(leftDepth - rightDepth) <= 1 && tree_is_balanced(root.left) && tree_is_balanced(root.right)) {
            //checks if the difference between the left and right side is less than or equal to 1
            //and recursively checks the left and right side of the tree
            return true;
        }
        return false;

    }

    public boolean isBST(Node root, double min, double max) { //checks if the tree is a binary search tree
        if (root == null) { return true; }

        if (root.data < min || root.data > max) {
            return false;
        }
        return isBST(root.left, min, root.data - 1 ) && isBST(root.right, root.data + 1, max);
    }


}