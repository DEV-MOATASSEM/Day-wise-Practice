/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
class sum{
    public int add(int...n){
        int tot=0;
        for(int k:n){
            tot=tot+k;
        }return tot;
    }
}
public class VaragasDemo {
    public static void main(String[] args) {
        sum obj=new sum();
        int t=obj.add(2,4,5,3,2,7);
        System.out.println(t);
        
    }
}
