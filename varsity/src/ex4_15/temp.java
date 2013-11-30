/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_15;

/**
 *
 * @author Ratan
 */
public class temp {
    
    private int temperature;
    
    public temp (int Fah)
    {
        // intialize the value of Fahrenheit
        this.temperature = Fah;
    }
    
    /**
     * This method takes nothing. You need to initialize the value of 
     * Temperature in Fahrenheit when creating a object of this class.
     * 
     * @return Temperature in Celsius as <code>int</code> value  
     */
    
    public float ToCal()
    {
        return ((float)((temperature-32)/1.8));
    }
    
}
