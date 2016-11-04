
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //ask how many minutes they use
        System.out.println("Number of daytime minutes?");
        double day = input.nextInt();
        System.out.println("Number of evening minutes?");
        double eve = input.nextInt();
        System.out.println("Number of weekend minutes?");
        double wee = input.nextInt();
        //determine the plans costs
        double daya = (day-100)*0.25;
        double dayb = (day-250)*0.45;
        double evea = eve*0.15;
        double eveb = eve*0.35;
        double weea = wee*0.20;
        double weeb = wee*0.25;
        //tell user the costs
        double a = daya + evea + weea;
        double b = dayb + eveb + weeb;
        System.out.println("Plan A costs " + a);
        System.out.println("Plan B costs " + b);
        if(a > b){
            System.out.println("Plan B is cheapest.");
        }if (b > a){
            System.out.println("Plan A is cheapest.");
        }
    }
}
