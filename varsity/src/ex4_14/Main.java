package ex4_14;

import java.util.Scanner;

/**
 *
 * Author:  Ratan
 * Email:   ratanparai@gmail.com
 * Twitter: http://twitter.com/ratanparai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a Scanner class object "in"
        Scanner in = new Scanner(System.in);
        
        // read and store the value of temperature in Fahrenheite
        int Fah = in.nextInt();
        
        // Create a tmp object of Class temp
        
        temp tmp = new temp(Fah);
        
        // Now print the result
        System.out.format("%.2f", tmp.ToCal() );
        
        // Just for printing a new line to look good. Nothing
        // is importent here ;)
        System.out.println();
        
        
    }

}
