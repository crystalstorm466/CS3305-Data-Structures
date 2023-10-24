//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 07-Part-1-Sorting
package Assignment07;

public class linkedList {
    //got some help from GitHub's CoPilot's AI
    //Github provides their AI for free if you're in college and sign up for it.
    //It's a great tool to use if you're stuck on a problem and need some help.
    //the previous comment was written using CoPilot. It just automatically suggested it.
    node head = null;

    public static class node { //I am using a custom linkedList implementatio.
        //defining nodes here
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

    node sortedMerge(node a, node b) { //the main function
        node result = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val <= b.val) { //compares the values of the nodes and sorts them accordingly using recursion
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);

        }
        return  result;
    }

    node mergeSort(node h) {
        if (h == null || h.next == null) {
            return h; //returns the node if it is null or if it is the last node
        }

        node middle = getMiddle(h); //gets the middle node
        node nextOfMiddle = middle.next; //gets the next node

        middle.next = null;

        node left = mergeSort(h); //recursively sorts the left side of the list

        node right = mergeSort(nextOfMiddle); //recursively sorts the right side of the list

        node sortedList = sortedMerge(left, right); //merges the two sides together
        return sortedList;
    }
    public static node getMiddle(node head) { //gets the middle node of the list
        if (head == null) {
            return head;
        }
        node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) { //iterates through the list
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
        void push(int new_data) { //adds a new node to the list
            node new_node = new node(new_data);
            new_node.next = head;
            head = new_node;
        }
        void printList(node headref) { //prints the list
            while (headref != null) {
                System.out.print(headref.val + " ");
                headref = headref.next;
            }
        }
    }
