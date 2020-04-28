/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Ternary_operator {
    public static void main(String[] args) {
        int i=4;
        int j=4;
        if(i==1){
            j=3;
        }
        else{
            j=2;
        }
        System.out.println(j);
        
        
        
        
        j=i==1?3:2;
        System.out.println(j);
        
        //####Using ternary Operator###
        
        Object obj1;
        Object obj2;
        if (true){
            obj1=new Integer(10);
        }
        else{
            obj1=new Double(20.00);
            
        }
        System.out.println(obj1);
        
        
        
        
        obj2=obj1=true?new Integer(10):new Double(20.00);
        System.out.println(obj2);
        //special characterstic of ternary operator is that it check the type of
        //value and whichever is maximum it occupy that type
    }
    
}
