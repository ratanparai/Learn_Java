/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_14;

/**
 *
 * @author Ratan
 */
public class Paisa {
    
    private float taka;

    Paisa(float Taka) {
        this.taka = Taka;
    }
    
    /**
     * This method take nothing. You have to initialize the value of
     * Taka when creating the object. value is taken in initialization
     * step.
     * @return Taka converted to Paisa in <code>int</code>
     */
    public int toPaisa()
    {
        // return the value of taka in Paisa by multiplying it with 100
        // You have to use Type casting to change the value to "int" from 
        // "float". easy way to do this is just 
        return (int)taka*100;
    }
    
}
