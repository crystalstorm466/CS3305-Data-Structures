package Assignment04;

import java.util.ArrayList;

public class CustomStack<T> {


    private int topA;
    private int topB;
    private ArrayList<T> twostacks;



    public CustomStack() {
        this.topA = 0;
        this.topB = 0;
    }

    public CustomStack(int n) {
        this.twostacks = new ArrayList<T>();
        this.topA = -1;
        this.topB = n;
    }

    public void pushA(T ele) {
        if (topA < topB - 1) {
            this.twostacks.add(++topA, ele);

        } else {
            System.out.println("Stack A is full.");
        }


    }

    public void pushB(T ele) {
        if (topB < twostacks.size() - 1) {
            this.twostacks.add(topB, ele);
            topB++;
        } else {
            System.out.println("Stack B is full.");
        }
    }
    public boolean isEmpty_a() {
        return this.topA == -1;
    }

    public boolean isEmpty_b() {
        return this.topB == this.twostacks.size();
    }

    public T popA() {
        if (!isEmpty_a()) {
            return this.twostacks.remove(topA--);
        } else {
            System.out.println("StackA is empty. Cannot pop.");
            return null;
        }
    }

    public T popB() {
        if (!isEmpty_b()) {
            return this.twostacks.remove(topB++);
        } else {
            System.out.println("StackB is empty. Cannot pop.");
            return null;
        }

    }

    public int getSize() {
        return this.twostacks.size();
    }

}