import java.util.*;

public class TestOneQuestion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Initial Stack: " + stack);
        System.out.println("Is stack empty?: " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after push option" + stack);
        System.out.println("Element popped out: " + stack.pop());
        System.out.println("Stack after Pop Operation: " + stack);
        System.out.println("Element 10 found at position: " + stack.search(10));
        System.out.println("Is stack empty?: " + stack.isEmpty());
        LinkedList<String> lst = new LinkedList<>();
        lst.add("hi");
        Collections.sort(lst);

    }
}
