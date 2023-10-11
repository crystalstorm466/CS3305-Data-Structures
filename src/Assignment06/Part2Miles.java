//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 06-Part-2.2-Miles
package Assignment06;

public class Part2Miles {
    public static void main(String[] args) {
        double miles = 0;
        double kilometers = 0;
        int[] milesArray = new int[10];
        milesArray[0] = 0; //input our test data which was given to us.
        milesArray[1] = 10;
        milesArray[2] = 20;
        milesArray[3] = 30;
        milesArray[4] = 40;
        milesArray[5] = 50;
        milesArray[6] = 60;
        milesArray[7] = 70;
        milesArray[8] = 80;
        milesArray[9] = 90;
        System.out.println("Miles\t\tKilometers"); //print out the header for the table on same line
        for (int i = 0; i < milesArray.length; i++) { //iterate through the array and print out the miles and kilometers.
            miles = milesArray[i]; //set miles to the current index of the array
            kilometers = miles * 1.6; //convert miles to kilometers
            System.out.println(miles + "\t\t\t" + kilometers); //print out the miles and kilometers on the same line
        }
        System.out.println("Time Complexity: O(n) because it is linear and takes n iterations every single time.");
        System.out.println("The n iterations in this scenario is milesArray.length which in our case is 10. However I could very easily code in some ways for " +
                "a user to input their own data.");
    }
}
