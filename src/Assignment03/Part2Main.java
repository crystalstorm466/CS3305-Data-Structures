//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Assignment: 3 – Part 2 Capitals
package Assignment03;

import java.util.*;

public class Part2Main {


    public static void main(String[] args) {
        System.out.println("[Guess the Capital]");
        int score = 0; //setups the score
        HashMap<String, String> capitals = new HashMap<>() {{ //decided to use a hashmap instead of two arrays with state and capitals
            /*
            I only used ai to generate the put("state", "capital") parts as it was monotonous
            and long to type out.
            I learned hashmaps from https://www.baeldung.com/java-initialize-hashmap and https://www.w3schools.com/java/java_hashmap.asp
             */
            put("Alabama", "Montgomery");
            put("Alaska", "Juneau");
            put("Arizona", "Phoenix");
            put("Arkansas", "Little Rock");
            put("California", "Sacramento");
            put("Colorado", "Denver");
            put("Connecticut", "Hartford");
            put("Delaware", "Dover");
            put("Florida", "Tallahassee");
            put("Georgia", "Atlanta");
            put("Hawaii", "Honolulu");
            put("Idaho", "Boise");
            put("Illinois", "Springfield");
            put("Indiana", "Indianapolis");
            put("Iowa", "Des Moines");
            put("Kansas", "Topeka");
            put("Kentucky", "Frankfort");
            put("Louisiana", "Baton Rouge");
            put("Maine", "Augusta");
            put("Maryland", "Annapolis");
            put("Massachusetts", "Boston");
            put("Michigan", "Lansing");
            put("Minnesota", "St. Paul");
            put("Mississippi", "Jackson");
            put("Missouri", "Jefferson City");
            put("Montana", "Helena");
            put("Nebraska", "Lincoln");
            put("Nevada", "Carson City");
            put("New Hampshire", "Concord");
            put("New Jersey", "Trenton");
            put("New Mexico", "Santa Fe");
            put("New York", "Albany");
            put("North Carolina", "Raleigh");
            put("North Dakota", "Bismarck");
            put("Ohio", "Columbus");
            put("Oklahoma", "Oklahoma City");
            put("Oregon", "Salem");
            put("Pennsylvania", "Harrisburg");
            put("Rhode Island", "Providence");
            put("South Carolina", "Columbia");
            put("South Dakota", "Pierre");
            put("Tennessee", "Nashville");
            put("Texas", "Austin");
            put("Utah", "Salt Lake City");
            put("Vermont", "Montpelier");
            put("Virginia", "Richmond");
            put("Washington", "Olympia");
            put("West Virginia", "Charleston");
            put("Wisconsin", "Madison");
            put("Wyoming", "Cheyenne");
        }};
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(); //random object

        for (int i = 0; i < 5; i++) {
            Object[] keys = capitals.keySet().toArray(); //puts all the states from the hashmap into an array
            String randomState = (String) keys[rand.nextInt(keys.length)]; //selects a random state from keys array
            System.out.println("Please guess the capital of: " + randomState); //displays it

            String userChoice = scan.nextLine();
            if (userChoice.equalsIgnoreCase(capitals.get(randomState))) { //case senstive answer checker
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
                System.out.println("The Correct Answer was: " + capitals.get(randomState));
            }
        }

        System.out.println("You got " + score + " correct answers!");
        System.out.println("Score: " + score + "/5 points!");
        System.exit(0);
       // System.exit(rand.nextInt(rand.nextInt(3305))); kills the program

    }

}
