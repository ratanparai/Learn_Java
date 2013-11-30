/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4_13;

/**
 *
 * @author Ratan
 */
public class ex4_13_harmonic {
    
    // Initialize varibles
    // Those are private variables. We do not want to change the
    // Values directly.
    private int n;
    private float result = 0;

    // Constructor
    public ex4_13_harmonic(int n) {
        this.n = n;
    }
    
    /**
     * Calculate the sum of  harmonic equation.
     * @return The sum of the harmonic equation in <code>int</code>
     */
    
    public double calculate()
    {
        for (int i=1; i<=n; i++)
        {
            
            result+= (float)(1.0/i);
            
        }
        
        return result;
    }
    
    
}
