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
public class Timeconversion {
    public static void main(String[]arg){
        Scanner scan=new Scanner(System.in);
        int hour,minutes,seconds,talsecon;
        System.out.print("Enter hours:");
        hour=scan.nextInt();      
        System.out.print("Enter minutes:");
        minutes=scan.nextInt();        
        System.out.print("Enter Seconds:");
        seconds=scan.nextInt();
        talsecon=+hour*3600+minutes*60+seconds;
        System.out.println("Total time in seconds is ="+talsecon);
        
    }
    
    
    
}
