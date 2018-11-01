/*
 *Sean Luo 31/10/2018
 *Fibonacci.java
 *This is progrem calculates the Fibonacci.
 */


package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("THe first nin fibonacci "
                + "numbers are listed as follows:\n1,1,2,3,5,8,13,21,34,......"
                + "\nWhat fibonacci term would you like to see?");
        int number1 = Integer.parseInt(number);
        int firstnumber = 1,thirdnumber = 0,secondnumber;
        
        for(int i = 1; i <= number1; i++){ 
        if( i<=1){
            secondnumber = 1;
        }
        else{
         secondnumber = thirdnumber + firstnumber;
            thirdnumber = firstnumber;
         firstnumber = secondnumber;
        }  
        System.out.println(secondnumber);
    }
    
}
}
