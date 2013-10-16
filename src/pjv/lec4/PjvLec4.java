/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author cuhellub
 */
public class PjvLec4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("Tomas", "Marny", 1234, 2.1);
        Student student2 = new Student("Tomas", "Fuk", 45678, 1.3);
        Student student3 = new Student("Honza", "Novak", 1234, 4.2);
        
        List<Student> list = new ArrayList<Student>();
        Set<Student> set = new HashSet<Student>();
        
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student1);
        
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student1);
        
        System.out.println(list);
        System.out.println(set);
    }
}
