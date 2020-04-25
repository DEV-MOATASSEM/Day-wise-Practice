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

public class Tempconverter {
public static void main(String[] args){
    float F,C;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the temperature in Farhenheit:");
    F=scan.nextInt();
    
   
    C=(5*(F-32))/9;
    System.out.println(F+"degree Farenheit equals to "+C+" degree Celsius");
   

    
}
}
