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
public class Speed {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int s,d;
        double t;
        System.out.print("Enter the speed of the Object:");
        s=scan.nextInt();
        System.out.print("Enter the value of Distance traveled by the Object:");
        d=scan.nextInt();
        t=d/s;
        System.out.println("Time required to cover "+d+" at speed of "+s+"m/s is ="+t+"seconds");
    }
    
}
