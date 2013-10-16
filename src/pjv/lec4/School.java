/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec4;

import java.util.List;
import java.util.Map;

/**
 *
 * @author cuhellub
 */
public class School {
    private Map<Integer, List<Student>> grades;

    public School(Map<Integer, List<Student>> grades) {
        this.grades = grades;
    }    
    
}
