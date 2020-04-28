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
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
       int x=scan.nextInt();
        if (x%2==0){
            System.out.println("Given number is even.");
        }
        else{
            System.out.println("Given number is odd.");
        }
    }
    
}
