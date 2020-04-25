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
public class Repetation {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number :");
        int x=scan.nextInt();
        for (int i=0;i<5;i++){
            System.out.print(x+" ");
        
    }System.out.println();
        for(int j=0;j<5;j++){
            System.out.print(x);
        }System.out.println();
    }
    
}
