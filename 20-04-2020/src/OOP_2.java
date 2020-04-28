/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 * 
 * We cannot create object without main method and we cannot call main method 
 * without object that's why we use word static to call main without object...
 * 
 * //Constructor is a method that give memory allocation (like gives membership
 * to a particular class.
 * 
 * 
 */

class Calc{
    int x;
    int y;
    int sum;
    public Calc(int n1,int y){ //creating custom constructure
        // we can write below variable assigninment steps also using *(this)* keyword...      
        x=n1;   
       // y=n2;
        //this.x=x;
        this.y=y;
    }
    void addition(){  //creating methods
    sum=x+y;
}
}

public class OOP_2 {
    public static void main(String[]args){
         Calc obj=new Calc(5,4);   //creating object with the help of constructer
        //
         obj.addition();   //calling a method
        System.out.println(obj.sum);
    }
}
