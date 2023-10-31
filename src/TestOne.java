import java.util.Scanner;

public class TestOne {

    public static void main(String[] args) {
        //is this
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
       System.out.print("What is intOne?: ");
       int intOne = scan.nextInt();
        System.out.print("What is intTwo?: ");
        int intTwo = scan.nextInt();
        System.out.println("The greatest gcd of " + intOne + " and " + intTwo + " is: " + gcd(intOne, intTwo));
    }

    //well to find the gcd its the greatest number that evenly divides intone and inttwo


    //is this method correct?


    public static int gcd(int intOne, int intTwo) {
        if (intTwo == 0) {
            return intOne;
        }  else {
            return (gcd((intOne % intTwo )  , ( intTwo / intOne )  ));
           // return (intOne % intTwo);
            //somehow from sere bruteforce and trying different combinations of -1, %, and / symbols I got it.....




    }
}}