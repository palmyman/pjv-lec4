/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec4;

/**
 *
 * @author cuhellub
 */
public class Student {
    private String name, surname;
    private int ID;
    private double marksAvg;

    public Student(String name, String surname, int ID, double marksAvg) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.marksAvg = marksAvg;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return ID;
    }

    public double getMarksAvg() {
        return marksAvg;
    }
    
    
}
