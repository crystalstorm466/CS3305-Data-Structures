//Name: David Holland
//Class: CS 3305/W02
//Term: Spring 2023
//Instructor: Carla McManus
//Assignment: 9-Part-2-AVL
package Assignment09;

import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {

    public boolean delete(E e);
    public void inorder();
    public void postorder();
    public void preorder();
    public int getSize();
    public boolean isEmpty();
}
