/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemonstration;

import java.util.Scanner;


/**
 *
 * @author Kavya Sri
 */
public class StudentDemonstration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your firstname:");
        String firstname = input.next();
        
        System.out.println("please enter your lastname:");
        String lastname = input.next();
        
        System.out.println("please enter your gpa:");
        double  totalcredits = input.nextDouble();
        
        
        System.out.println("please enter your totalcredits:");
        int gpa = input.nextInt();
        
        student student = new student(firstname, lastname, totalcredits, gpa);
        
        
        
        System.out.println(student.toString());
    }
}
    

