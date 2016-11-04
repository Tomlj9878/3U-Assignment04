
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for the limit
        System.out.println("Enter speed limit: ");
        double limit = input.nextInt();
        //recorded speed of car?
        System.out.println("Enter recorded speed of car: ");
        double record = input.nextInt();
        //determine if they're speeding or not
        double ans = limit - record;
        //tell user
        if(1 < ans && ans >20){
            System.out.println("You are speeding and your fine is $100.");
        }if(21 < ans && ans > 30){
            System.out.println("You are speeding and your nfine is $270.");
        }if(31 < ans){
            System.out.println("You are speeding and your fine is $500.");
        }if(ans < 1){
            System.out.println("Congradulations, you are within the speed limit.");
        }
            
    }
}
