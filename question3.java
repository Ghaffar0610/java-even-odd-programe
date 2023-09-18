/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghaffar;

import java.util.Scanner;

/**
 *
 * @author Lab-5
 */
public class question3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
          System.out.println("Enter the number to find =");
          int num=sc.nextInt();
   
        System.out.println( (num%2==0)? num +"is Even":num+"is Odd");

                
    
}
    
}
