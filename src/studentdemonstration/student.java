/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemonstration;

/**
 *
 * @author Kavya Sri
 */
public class student {
    private String firstName;
    private String LastName;
    private double gpa;
    private int totalcredits;

    public student(String firstName, String LastName, double gpa, int totalcredits) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.gpa = gpa;
        this.totalcredits = totalcredits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTotalcredits() {
        return totalcredits;
    }

    public void setTotalcredits(int totalcredits) {
        this.totalcredits = totalcredits;
    }

    @Override
    public String toString() {
        return "student{" + "firstName=" + firstName + ", LastName=" + LastName + ", gpa=" + gpa + ", totalcredits=" + totalcredits + '}';
    }
    
    
    
    
}
