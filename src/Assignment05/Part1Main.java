//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 05-Part-1-Queues
package Assignment05;

import java.util.*;


 class Chore { //since the chore class is so small anyway I put it in the same main.java file
   private int priority;
   private String name;

//    public Chore() {
//        this.priority = 0;
//        this.name = null;
//    }

    public Chore(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() { return priority; }
    public String getName() { return name; }
}
public class Part1Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      Queue<Chore> chores = new PriorityQueue<>(Comparator.comparingInt(Chore::getPriority)); //unlike 2b2t we don't need to pay $20 to get access to the priority queue.
      //I did have Comparator.comparingInt(chore -> chore.getPriority() but then intelliJ suggested I use Chore::getPriority
        // Queue<String> chores = new LinkedList<>();
        System.out.println("[Chores]");
        //listing with random chores. If you want user data just comment this part out and uncomment the for loop
        chores.add(new Chore("Clean the dishes", 3));
        chores.add(new Chore("Take out the trash", 4));
        chores.add(new Chore("Mow the lawn", 8));
        chores.add(new Chore("Do the laundry", 6));
        chores.add(new Chore("Walk the dog", 2));
        chores.add(new Chore("Buy groceries", 7));
        chores.add(new Chore("Water the plants", 5));
        chores.add(new Chore("Clean the bathroom", 1));
        chores.add(new Chore("Vacuum the house", 9));
        chores.add(new Chore("Cook dinner", 1));

        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("What is the chore you want to add?: ");
            String name = scan.nextLine();
            System.out.println("What is the priority of this queue?: ");
            int priority = scan.nextInt();
            chores.add(new Chore(name, priority));
        }
        This is for user input. Uncomment for user input
         */

        while(!(chores.isEmpty())) { //keeps going until the chore queue is empty
            Chore chore = chores.poll();
            System.out.println("Current Chore: " + chore.getName() + ". Priority: " + chore.getPriority() );
            System.out.print("Did you do your current chore? (Y/N): ");
            String choreYN = scan.next();
            if (choreYN.equalsIgnoreCase("n")) {
                System.out.println("Do your chores!");
                System.out.println("Do your chores!");
                System.out.println("Do your chores!");
                System.out.println("Do your chores!"); //spams user because they didn't do chores
                System.out.println("Do your chores!");
                System.out.println("Do your chores!");
                System.out.println("Current Chore: " + chore.getName() + ". Priority: " + chore.getPriority());

            }
        }

        System.out.println("Congrats you did your chores!");
        System.out.println("However you still need to pay $20 to access the priority queue.");
        System.out.print("Please provide your Ethereum address or USDC address here: ");
        String walletAddress = scan.next(); //my intrusive thoughts is telling me to write this to a .txt file but I won't even get your address
        System.out.println("Send $20 of Ethereum or USDC to: 0x2e9CD8C1b6D0F985ABaFEBe6d029934c5Fc38160"); //this is my real wallet address on robinhood
        System.out.println("Please make sure you are sending through the Ethereum blockchain");
        System.out.println("_______________________________________________________________________");

    }
}