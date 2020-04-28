/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Inner_class {
    public static void main(String[]args){
        outer s1=new outer();

        outer.inner s2=s1.new inner();
        s2.show();



} 
    
}
class outer{
  
    class inner{
        void show(){
        System.out.println("Hello from inner..");
    } 

}
}   
