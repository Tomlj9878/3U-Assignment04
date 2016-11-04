
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //ask user for their name
        System.out.println("Please enter your name");
        //get name from user
        String name = input.nextLine();
        //ask about test 1 
        System.out.println("What was the first test out of?");
        double onea = input.nextInt();
        System.out.println("What was your first mark?");
        double oneb = input.nextInt();
        //ask about test 2
        System.out.println("What was the second test out of?");
        double twoa = input.nextInt();
        System.out.println("What was your second mark?");
        double twob = input.nextInt();
        //ask about test 3
        System.out.println("What was the thrid test out of?");
        double thra = input.nextInt();
        System.out.println("What was your third mark?");
        double thrb = input.nextInt();
        //ask about test 4
        System.out.println("What was the fourth test out of?");
        double foua = input.nextInt();
        System.out.println("What was your fourth mark?");
        double foub = input.nextInt();
        //ask about test 5
        System.out.println("What was the fifth test out of?");
        double fiva = input.nextInt();
        System.out.println("What was your fifth mark?");
        double fivb = input.nextInt();
        //determine the percentages
        double a = (oneb/onea)*100;
        double b = (twob/twoa)*100;
        double c = (thrb/thra)*100;
        double d = (foub/foua)*100;
        double e = (fivb/fiva)*100;
        //state name
        System.out.println("Test Scores for " + name);
        //tell the user
        System.out.println("Test 1: " + a);
        System.out.println("Test 2: " + b);
        System.out.println("Test 3: " + c);
        System.out.println("Test 4: " + d);
        System.out.println("Test 5: " + e);
        //determine the average
        double average = (a + b + c + d + e)/5;
        //tell user
        System.out.println("Average: " + average);
    }
}
