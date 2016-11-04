
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //ask user how much food costs
        System.out.println("How much does the food cost?");
        int food = input.nextInt();
        //ask user how much the DJ costs
        System.out.println("How much does the DJ cost?");
        int DJ = input.nextInt();
        //ask the user how much the hall costs
        System.out.println("How much does the hall cost to rent?");
        int hall = input.nextInt();
        //ask user how much decorations cost
        System.out.println("What are the decorations worth?");
        int decor = input.nextInt();
        //ask user how much staff cost
        System.out.println("What does it cost for Staff?");
        int staff = input.nextInt();
        //ask user how much misc costs
        System.out.println("How much is the miscellaneous worth?");
        int misc = input.nextInt();
        //find the total cost
        int total = food + DJ + hall + decor + staff + misc;
        //find amout of tickets you need to sell
        int tick = total / 35;
        //tell user
        System.out.println("The total cost will be " + total + ". You need to sell " + tick + " tickets to break even");
    }
}
