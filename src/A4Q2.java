
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //ask for number of inches
        System.out.println("Please enter the measurement in inches you wish to convert");
        int inches = input.nextInt();
        int centi = (int) (2.54 * inches);
        //tell user the final number
        System.out.println("The answer is " + centi + "cm");
    }
}
