//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 07-Part-2-Heaps
package Assignment07;
import java.util.*;

public class Heap<E extends Comparable<E>> {

    private ArrayList<E> list = new ArrayList<>(); //working list - acts as the "heap"
    public Heap() {} //default constructor

    public Heap(E[] objects) { //overloaded constructor
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    public void add(E newObject) {
        list.add(newObject);
        int currentIndex = list.size() - 1;

        //add new object to the heap and sorts the value into the correct position
        while(currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }
            else
                break;
            currentIndex = parentIndex;
        }
    }

    //Remove root from the heap and makes sure the heap is still in the correct order
    public E remove() {
        if (list.size() == 0) return null;
        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while(currentIndex < list.size()) { //sorts the heap
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            //Find the maximum between two children
            if (leftChildIndex >= list.size()) break; //The tree is a heap
            int minIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (list.get(minIndex).compareTo(list.get(rightChildIndex)) > 0) {
                    minIndex = rightChildIndex;
                }
            }

            //Swap if the current node is less than the maximum
            if (list.get(currentIndex).compareTo(list.get(minIndex)) > 0) {
                E temp = list.get(minIndex);
                list.set(minIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = minIndex;
            }
            else
                break; //The tree is a heap
        }
        return removedObject;
    }
    public int getSize() { return list.size(); }

}
