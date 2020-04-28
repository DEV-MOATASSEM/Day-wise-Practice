/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
//Method and constructor overloading
class calc2{
//constructor overloading
    int i;
    int j;
    String oper="Nothing";
    public calc2(){
    i=0;
    j=0;
    oper="Nothing" ;   
    }
    public calc2(int x){
    i=x;
    j=0;
    oper="Nothing" ;  
    }
    public calc2(int x, int y){
    i=x;
    j=y;
    oper="Nothing"  ;  
    }
    public calc2(int x, int y,String op){
    i=x;
    j=y;
    oper=op;    
    }
  //method overloading
    void add(int x,int y){
    System.out.println(x+y);
}
        void add(int x,int y,int z){
    System.out.println(x+y+z);
}
            void add(double x,double y){
    System.out.println(x+y);
}
}

public class Method_Overloading {
     public static void main(String[]args){
        calc2 obj=new calc2();
        obj.add(2,9);
        obj.add(2,9,6);
        obj.add(2.9,4.5);
    /*
     calc2 obj1=new calc2(2);
     calc2 obj2=new calc2(3,4);
     calc2 obj3=new calc2(3,6,"Hello");
*/
}
}