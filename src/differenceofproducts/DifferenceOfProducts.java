/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differenceofproducts;

import java.util.Scanner;

/**
 *
 * @author Yusuf
 */
public class DifferenceOfProducts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the simple calculator 😁");
        System.out.println("__________________________________");
        int n1,n2,n3,n4;
        System.out.println("Enter the first number value:");
        n1 = scanner1.nextInt();
        System.out.println("Enter the second number value:");
        n2 = scanner1.nextInt();
        System.out.println("Enter the third number value:");
        n3 = scanner1.nextInt();
        System.out.println("Enter the first fourth value:");
        n4 = scanner1.nextInt();
        //end of getting inputs
        
        System.out.println
        (
           (n1*n2)-(n3*n4)
        );
        
    }
    
}
