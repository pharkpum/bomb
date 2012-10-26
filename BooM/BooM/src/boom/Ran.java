/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boom;

/**
 *
 * @author THE_1
 */
public class Ran {
    public int Randombomb(){
        int i = (int) ( Math.random()* 5 )+1;
        return i;
    }
    
    public int RandomItem(){
        int i = (int) ( Math.random()* 2 )+1;
        return i;
    }
}
