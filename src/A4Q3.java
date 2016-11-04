
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for 4 number on seperate lines
        System.out.println("Please enter 4 numbers on seperate lines");
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        //tell user their numbers
        System.out.println("Your numbers were " + one + ", " + two + ", " + three + ", " + four + ", ");
        
    }
}
