//Name: David Holland
//Class: CS 3305/W02
//Term: Spring 2023
//Instructor: Carla McManus
//Assignment: 9-Part-2-AVL
package Assignment09;

public abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public void inorder() { }

    @Override
    public void postorder() {}

    @Override
    public void preorder() {} //preorder like preodering Iron Flame by Rebecca Yaros? The second Fourth Wing book???!?!

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }



}
