/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Enhanced_for_loop {
    public static void main(String[] args) {
        int a[]={5,4,2,6};
        int d[][]={
            {1,2,3,4,6},
            {9,8,7,4},
            {5,6,7,4,7,3}
        };
        //enhanced for loop for 1D array
        for(int k:a){
            System.out.println(k);
        }
        //enhanced for loop for 2D array
        for(int e[]:d){
            for(int h:e){
             System.out.print(" "+h);   
            }System.out.println();
        }
        
         
    }
    
}
