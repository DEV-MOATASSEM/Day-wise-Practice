


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
public class swap {
    public static void main(String[]arg){
        Scanner scan=new Scanner(System.in);
        int x,y,temp;
        System.out.print("Enter first Number:");
        x=scan.nextInt();      
        System.out.print("Enter 2nd number:");
        y=scan.nextInt();        
        temp=x;
        x=y;
        y=temp;
        System.out.println("first Number: ="+x);
        System.out.println("2nd Number: ="+y);
        
    }
    
    
    
}
    

