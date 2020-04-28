/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Dollar_box_pattern {
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            if(i==1 || i==4){
               for(int j=1;j<=4;j++){
               System.out.print("$ "); 
            }System.out.println();
            }
            else{
                   System.out.print("$     $"); 
                   System.out.println();
            }
            
            }
        }
    }

