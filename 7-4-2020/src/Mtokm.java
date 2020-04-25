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
public class Mtokm {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        double m,k;
        System.out.print("Enter the value of distance in miles:");
        m=scan.nextDouble();
        k=m*1.60935;
        System.out.println(m+" Miles are equal to "+k+" Kilometers.");
        
        
        
    }
}
