package grades;
import java.util.*;



import java.util.ArrayList;
import java.util.List;

public class Student {
    // create properties
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName()
        { return this.name;
        }
    // adds the given grade to the grades property
    public void addGrade(int grade)
        { grades.add(grade);
        }


    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (int i = 0; i<this.grades.size(); i++) {
            total += this.grades.get(i);
////        for (Integer grade : this.grades) {
//            total += grade;
        }
        return Math.round(total / this.grades.size());
    }

    public static void main(String[] args) {
        Student mark = new Student("Mark");
        mark.addGrade(90);
        mark.addGrade(85);
        mark.addGrade(40);
        System.out.println(mark.getGradeAverage());
    }

}
