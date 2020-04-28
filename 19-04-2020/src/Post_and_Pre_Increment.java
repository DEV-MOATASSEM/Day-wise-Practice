/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class Post_and_Pre_Increment {
    public static void main(String[]args){
    //post increment  is >>> i++
    
    int i=7; 
    int j=i++;
    System.out.println(j);
    System.out.println(i);
    
    //pre increment is >>> ++i
    int x=7; 
    int y=++x;
    System.out.println(y);
    System.out.println(x);
    
    //Complex one
    int a=2;
    int temp=a;   /* here we are first assigning value of a to temp 
    so temp will be 2 ......... Then we increment a so value of becomes 3
    but then we we give values of temp which was 2 to variable a that's why 
    2 is printing*/
    a++;
    a=temp;
    //a=a++;
    System.out.println(a); 
            
    
    }

    
}
