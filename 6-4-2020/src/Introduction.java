
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
import java.util.Scanner;
public class Introduction {
public static void main(String[] args){
    String name,college,petname;
    int age;
    Scanner scan=new Scanner(System.in);
    System.out.println("What is your name?"); 
    name=scan.nextLine();
    System.out.println("What is your petname?"); 
    petname=scan.nextLine();
    System.out.println("In which college or University do you study?"); 
    college=scan.nextLine();
    System.out.println("What is your age?"); 
    age=scan.nextInt();
    System.out.println("Hello, my name is "+name+ "and I am "+age+" years \n old. I’m enjoying my time at "+college+", though \n I miss my pet "+petname+" very much!");  
}
}    

