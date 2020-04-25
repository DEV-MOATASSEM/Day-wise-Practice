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
public class Avarage {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int x,y,z,avg;
        System.out.print("Enter the first integer:");
        x=scan.nextInt();
        System.out.print("Enter the second integer:");
        y=scan.nextInt();
        System.out.print("Enter the Third integer:");
        z=scan.nextInt();
        avg=(x+y+z)/3;
        System.out.println("Avarage of 1st,2nd and 3rd integer is ="+avg);
    }
    
}
