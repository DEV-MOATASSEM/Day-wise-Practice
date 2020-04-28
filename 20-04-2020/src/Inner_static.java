/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Inner_static {
     public static void main(String[]args){
        outer1 s1=new outer1();

        outer1.inner1 s2=new outer1.inner1();
        s2.show();



} 
    
}
class outer1{
  
    static class inner1{
        void show(){
        System.out.println("Hello from inner..");
    } 

}
}   


