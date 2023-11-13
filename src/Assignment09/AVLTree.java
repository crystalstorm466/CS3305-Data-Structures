//Name: David Holland
//Class: CS 3305/W02
//Term: Spring 2023
//Instructor: Carla McManus
//Assignment: 9-Part-2-AVL
package Assignment09;

import java.util.*;

/** ___________________________________________________________________________
 /*** Everything below this line is taken from the textbook.
 **/
public class AVLTree<E extends Comparable<E>> extends BST<E> {

    public AVLTree() {}

    public AVLTree(E[] objects) {
        super(objects);
    }

    @Override
    protected AVLTreeNode<E> createNewNode(E e) {
        return new AVLTreeNode<>(e);
    }




    @Override
    public boolean insert(E e) {
        boolean successful = super.insert(e);
        if (!successful) return false;
        else {
            balancePath(e);
        }
        return true;
    }

    private void updateHeight(AVLTreeNode<E> node) {
        if (node.left == null && node.right == null) { //node is a leaf
            node.height = 0;

        } else if (node.left == null) {
            node.height = 1 + ((AVLTreeNode<E>) node.right).height;
        } else if (node.right == null) {
            node.height = 1 + ((AVLTreeNode<E>) node.left).height;
        } else {
            node.height = 1 + Math.max(((AVLTreeNode<E>) node.right).height, ((AVLTreeNode<E>) node.left).height);
        }
    }

    private void balancePath(E e) {
        ArrayList<TreeNode<E>> path = path(e);
        for (int i = path.size() - 1; i >= 0; i--) {
            AVLTreeNode<E> A = (AVLTreeNode<E>) (path.get(i));
            updateHeight(A);
            AVLTreeNode<E> parentOfA = (A == root) ? null : (AVLTreeNode<E>) (path.get(i - 1));

            switch (balanceFactor(A)) {
                case -2:
                    if (balanceFactor((AVLTreeNode<E>) A.left) <= 0) {
                        balanceLL(A, parentOfA);
                    } else {
                        balanceLR(A, parentOfA);
                    }
                    break;
                case +2:
                    if (balanceFactor((AVLTreeNode<E>) A.right) >= 0) {
                        balanceRR(A, parentOfA);
                    } else {
                        balanceRL(A, parentOfA);
                    }
                    break;
            }

        }
    }

    private int balanceFactor(AVLTreeNode<E> node) {
        if (node.right == null) // node has no right subtree
            return -node.height;
        else if (node.left == null) // node has no left subtree
            return +node.height;
        else
            return ((AVLTreeNode<E>) node.right).height -
                    ((AVLTreeNode<E>) node.left).height;
    }

    private void balanceLL(TreeNode<E> A, TreeNode<E> parentOfA) {
        TreeNode<E> B = A.left;

        if (A == root) {
            root = B;
        } else {
            if (parentOfA.left == A) {
                parentOfA.left = B;
            } else {
                parentOfA.right = B;
            }
        }
        A.left = B.right;
        B.right = A;
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
    }

    private void balanceLR(TreeNode<E> A, TreeNode<E> parentOfA) {
        TreeNode<E> B = A.left;
        TreeNode<E> C = B.right;

        if (A == root) {
            root = C;
        } else {
            if (parentOfA.left == A) {
                parentOfA.left = C;
            } else {
                parentOfA.right = C;
            }
        }
        A.left = C.right;
        B.right = C.left;
        C.left = B;
        C.right = A;

        //adjust heights
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
        updateHeight((AVLTreeNode<E>) C);
    }

    /**
     * Balance RR (see Figure 26.3)
     */
    private void balanceRR(TreeNode<E> A, TreeNode<E> parentOfA) {
        TreeNode<E> B = A.right; // A is right-heavy and B is right-heavy
        if (A == root) {
            root = B;
        } else {
            if (parentOfA.left == A) {
                parentOfA.left = B;
            } else {
                parentOfA.right = B;
            }
        }
        A.right = B.left; // Make T2 the right subtree of A
        B.left = A;
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
    }

    /**
     * Balance RL (see Figure 26.5)
     */
    private void balanceRL(TreeNode<E> A, TreeNode<E> parentOfA) {
        TreeNode<E> B = A.right; // A is right-heavy
        TreeNode<E> C = B.left; // B is left-heavy
        if (A == root) {
            root = C;
        } else {
            if (parentOfA.left == A) {
                parentOfA.left = C;
            } else {
                parentOfA.right = C;
            }
        }
        A.right = C.left; // Make T2 the right subtree of A
        B.left = C.right; // Make T3 the left subtree of B
        C.left = A;
        C.right = B;

        //Adjust heights
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
        updateHeight((AVLTreeNode<E>) C);
    }

    @Override
    /** Delete an element from the AVL tree.
     * Return true if the element is deleted successfully
     * Return false if the element is not in the tree */
    public boolean delete(E element) {
        if (root == null)
            return false; // Element is not in the tree
        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else
                break; // Element is in the tree pointed by current
        }

        if (current == null)
            return false; // Element is not in the tree


        // Case 1: current has no left children (See Figure 25.10)
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) {
                root = current.right;
            } else {
                if (element.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
                // Balance the tree if necessary
                balancePath(parent.element);
            }
        } else {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            //  the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right
            }

            //replace the element in current by the element in rightMost
            current.element = rightMost.element;

            //eliminate rightmost node
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                // Special case: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;

                //Balance the tree if necessary
                balancePath(parentOfRightMost.element);
            }
        }
        size--;
        return true;
    }

/** ___________________________________________________________________________
 /*** Everything above this line is taken from the textbook.
**/
 public int getHeight(TreeNode<E> node) { //gets the height of the entire tree by finding the max height of its subtrees
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right) );
 }

 public boolean isBalanced(TreeNode<E> root) {
    int lefth; //hight of left subtree
    int righth; //height of right subtree

     if (root == null) { return true; }

    lefth = getHeight(root.left);
    righth = getHeight(root.right);
    if (Math.abs(lefth - righth) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
        return  true;
    }
    return false;
 }

 //AVLTreeNode is Tree Node plus height
 protected static class AVLTreeNode<E extends Comparable<E>> extends BST.TreeNode<E> {
 protected int height = 0;

 public AVLTreeNode(E e) {
 super(e);
 }
 }

 }
