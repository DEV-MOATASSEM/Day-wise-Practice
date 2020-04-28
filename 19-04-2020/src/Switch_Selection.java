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
public class Switch_Selection {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
         //work with int
        System.out.print("Enter the number:");
        int i=scan.nextInt();
        // work with char
        System.out.print("Enter the character:");
        String j=scan.nextLine();
        switch(j){
            case "a":  
                System.out.println("one:");
                break;
            case "b":
                System.out.println("Two:");
                break;
            case "c":
                System.out.println("Three:");
                break;
            case "d":
                System.out.println("Four:");
            default:
                System.out.println("Ok bye Idiots:");;
                /*Here if for instance case 2 becomes trure it will executes 
all the remaining one.... So in order to avoid this and make it work like if 
statement we add break statement.... so that if case 1 is executed it should 
break the block....... It has it's own use too..😊
*/
    }
    
}
}
