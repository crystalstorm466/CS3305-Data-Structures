//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 06-Part-2.1-Time
package Assignment06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Part2Time {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"); // Date format
        LocalDateTime now = LocalDateTime.now(); //Grabs current time from LocalDateTime
        String date = dtf.format(now); //uses dtf to format the time in a readable format for us peasant humans.
        System.out.println("Date: " + date);
        System.out.println("Time Complexity: O(1) because it is linear and only takes 1 iteration every single time.");

    }


}
