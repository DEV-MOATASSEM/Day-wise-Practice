/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
class calc{
    int x;
    int y;
    int sum;
    void addition(){
    sum=x+y;
}
}


public class OOP_1 {
    public static void main(String[]args){
        calc obj=new calc();
        obj.x=3;
        obj.y=6;
        obj.addition();
        System.out.println(obj.sum);
    }
    
}
