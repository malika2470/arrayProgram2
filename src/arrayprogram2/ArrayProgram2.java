/*Malika Sharma
 *18/10/2019
 *Array Programs 2
 * 
 */

package arrayprogram2;

import java.util.Scanner;

/**
 *
 * @author masha2470
 */
public class ArrayProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5];
        
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The second, third  and fourth names listed were:");
        System.out.println("Second:"+ friends[1]);
        System.out.println("Third: " + friends[2]);  
        System.out.println("Fourth: " + friends[3]);
        
    }
    
}
