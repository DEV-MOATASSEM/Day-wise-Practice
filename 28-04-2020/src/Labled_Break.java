
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Labled_Break {
    public static void main(String[] args) {
        Moatassem:
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if (i==2)
                    break Moatassem;
               System.out.print(" *"); 
            }
            System.out.println();
        }
        
    }
    
}
