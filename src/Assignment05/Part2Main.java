//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 05-Part-2-Shoppers
package Assignment05;

import java.util.*;

class Customer {} //I believe this is all I need for now

public class Part2Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("[Kroger]");
        System.out.println("Welcome Valued Customer");
        System.out.println("Insert Cash or Select Payment Type"); //kroger self checkout lore

        Queue<Customer> queue1 = new LinkedList<Customer>(); //creates the checkout lanes
        Queue<Customer> queue2 = new LinkedList<Customer>();
        Queue<Customer> queue3 = new LinkedList<Customer>();
        Queue<Customer> queue4 = new LinkedList<Customer>();
        Queue<Customer> queue5 = new LinkedList<Customer>();

    //       queue1.add(new Customer());
    //        queue2.add(new Customer());
    //        queue3.add(new Customer());
    //        queue4.add(new Customer());
    //        queue5.add(new Customer());

        Random rand = new Random();
        int line1 = 0;
        int line2 = 0;
        int line3 = 0;
        int line4 = 0;
        int line5 = 0;
        int randomAsle = 0;
        int randomTime = 0;
        for (int i = 1; i < 5; i++) { //placining initial 5 customers
             randomAsle = rand.nextInt(5);
             randomTime = rand.nextInt(5000);
            Customer newCustom = new Customer();
            switch(randomAsle) {
                case 0: //since there is no 0 aisle this is aisle 1
                    randomAsle = 1;
                case 1:
                    queue1.add(newCustom);
                    line1++;
                    Thread.sleep(randomTime);
                    System.out.println(("Customer has gone in " + randomAsle + " and has taken " + randomTime + "ms to complete.") );
                    break;
                case 2:
                    queue2.add(newCustom);
                    line2++;
                    Thread.sleep(randomTime);
                    System.out.println(("Customer has gone in " + randomAsle + " and has taken " + randomTime + "ms to complete.") );
                    break;
                case 3:
                    queue3.add(newCustom);
                    line3++;
                    Thread.sleep(randomTime);
                    System.out.println(("Customer has gone in " + randomAsle + " and has taken " + randomTime + "ms to complete.") );
                    break;
                case 4:
                    queue4.add(newCustom);
                    line4++;
                    Thread.sleep(randomTime);
                    System.out.println(("Customer has gone in " + randomAsle + " and has taken " + randomTime + "ms to complete.") );
                    break;
                case 5:
                    queue5.add(newCustom);
                    line5++;
                    Thread.sleep(randomTime);
                    System.out.println(("Customer has gone in " + randomAsle + " and has taken " + randomTime + "ms to complete.") );
                    break;
            }


        }




    }
}
