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
public class Multiplication_Table {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the number or Multiplication Table:");
            int y=scan.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(y+"x"+i+"="+(y*i));
            }
    }
}

