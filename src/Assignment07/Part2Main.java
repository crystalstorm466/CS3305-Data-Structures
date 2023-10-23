//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 07-Part-2-Heaps
package Assignment07;
import java.util.*;


public class Part2Main {


    public static void main(String[] args) {
        System.out.println("[Heap Sort");
        System.out.println("Please print 5 numbers: ");
        Integer[] presort = new Integer[6];
        for (int i = 0; i <= 5; i++) { //creating test data
            Scanner scan = new Scanner(System.in);
            System.out.print("Please print number " + i + ": ");
            int num = scan.nextInt();
            presort[i] = num;
        }
        heapSort(presort); //sorts the data into a heap using minSort


    }

    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<>();

        for (int i = 0; i < list.length; i++) {
            heap.add(list[i]); //adds each node to the heap
        }
        System.out.println("Removing from heap: ");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + ","); //prints each node one at a time
            list[i] = heap.remove();
        }

    }
}