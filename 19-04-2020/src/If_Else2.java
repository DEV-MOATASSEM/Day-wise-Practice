/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
import java.util.Scanner;

public class If_Else2 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:");
        int i=scan.nextInt();
        
        if(i==1)
            System.out.println("one:");
        else if(i==2)
                System.out.println("Two:");
        else if(i==3)
            System.out.println("Three:");
        else
            System.out.println("End:");
            
    }
    
}
