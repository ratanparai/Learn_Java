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
        
        // Create Scanner Object in 
        Scanner in = new Scanner(System.in);
        
        // read float value and save it to the variable Taka
        float Taka = in.nextFloat();
        
        // Create Paisa Class's Object obj
        Paisa obj = new Paisa(Taka);    
        
        // Now print out the paisa
        System.out.println(obj.toPaisa());
        
        
    }

}
