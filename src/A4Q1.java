
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //aske user for their name
        System.out.println("What is your name?");
        //get the name from the user
        String name = input.nextLine();
        //say hello
        System.out.println("Hello " + name + ". How are you today?");
    }
}
