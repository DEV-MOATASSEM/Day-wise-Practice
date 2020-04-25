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
public class Operators {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter the first number:");
        x=scan.nextInt();
        System.out.print("Enter the 2nd number:");
        y=scan.nextInt();
        System.out.print("Enter the 3rd number:");
        z=scan.nextInt();
        System.out.println("Result of specified numbers "+x+","+y+" and "+z+",(x+y).z is "+((x+y)*z)+" and x.y + y.z is "+(x*y+y*z));
    }
    
}
