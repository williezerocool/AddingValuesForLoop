/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addingvaluesforloop;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class AddingValuesForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         
        
        int userInput, a;
        a = 0;
        
        System.out.print("give me a number: ");
        userInput = kb.nextInt();
        
        for(int i=0; i <= userInput ; i++){
            
            a += i;
            System.out.print(i);
        }
      
   
        System.out.println("\n" + "The sum is: " + a);
    
    
    
    }
    
}
