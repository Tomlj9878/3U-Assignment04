
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count<100){
            System.out.println("Enter sum of dice: ");
            int sum = input.nextInt();
            count = count + sum;
            if(count == 54){
                count = count - 35;
            }if(count == 90){
                count = count - 42;
            }if(count == 99){
                count = count - 22;
            }if(count == 9){
                count = count + 25;
            }if(count == 40){
                count = count + 24;
            }if(count == 67){
                count = count + 19;
            }
            System.out.println("You are now on square " + count);
       }if(count == 100){
           System.out.println("YOU WIN");
       }
    }
}