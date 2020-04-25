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
public class MultiplicationTable {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int number,result;
        System.out.print("Enter the number:");
        number=scan.nextInt();
        for(int i=1;i<=10;i++){
            result=number*i;
            System.out.println(number+"*"+i+"="+result);
        }
        
        
    }
}
