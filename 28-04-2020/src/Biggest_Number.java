/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Biggest_Number {
    public static void main(String[] args) {
        int x,y,z;
        x=9;
        y=6;
        z=4;
        if (x>y && x>z){
            System.out.println(x+" is the biggest number");
        }
        else if(y>z){
            System.out.println(y+" is the biggest number.");
            
        }
        else{
            System.out.println(z+" is the biggest number.");
        }
        
    }
    
}