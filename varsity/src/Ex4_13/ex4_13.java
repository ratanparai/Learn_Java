/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4_13;

import java.util.Scanner;

/**
 *
 * @author Ratan
 */
public class ex4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a Scanner object, in with System.in params
        Scanner in = new Scanner(System.in);
        
        // Declare Variables to hold the value of n
        int n;
        
        // read the value of n from keyboard and store it
        n = in.nextInt();
        
        // Create a new Object of harmonic class
        ex4_13_harmonic obj = new ex4_13_harmonic(n);
        
        // here,
        // obj.calculate return the result and we are printing the 
        // result with the help of System.out.println()
        System.out.println(obj.calculate());
        
    }
}
