/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */   
public class Static {
     public static void main(String[]args){
        Student s1=new Student();
        s1.roll=393;
        s1.name="Moatassem";
        
        Student.campus_code=74284;
        Student s2=new Student();
        s2.roll=398;
        s2.name="Shahrayar";
        s1.show();
        s2.show();


} 
    
}
class Student{   //class
    
    String name;
    
    int roll;
    static int campus_code;
    
    public Student(){  //constructor
    name="Genius";
    roll=01;
       
    }
    static{ 
    campus_code=2447765; 
    }

    void show(){        //method
    System.out.println(name+":"+roll+":"+campus_code);
}

}