/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_14;

/**
 *
 * @author Ratan
 */
public class temp {
    
    private int temperature;
    
    public temp (int Fah)
    {
        // intialize the value of Fahrenheite
        this.temperature = Fah;
    }
    
    public float ToCal()
    {
        return ((float)((temperature-32)/1.8));
    }
    
}
