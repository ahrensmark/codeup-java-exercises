package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    static Map<String,Student> students;

    private static void init() {
        students = new HashMap<String,Student>();
        Student Mark = new Student("Mark");
        Mark.addGrade(90);
        Mark.addGrade(85);
        Mark.addGrade(40);

        Student Aaron = new Student("Aaron");
        Aaron.addGrade(95);
        Aaron.addGrade(86);
        Aaron.addGrade(100);

        Student Susan = new Student("Susan");
        Susan.addGrade(117);
        Susan.addGrade(250);
        Susan.addGrade(30);

        Student Nick = new Student("Nick");
        Nick.addGrade(43);
        Nick.addGrade(26);
        Nick.addGrade(0);
        Nick.addGrade(46);

        students.put("Mark", Mark);
        students.put("Aaron", Aaron);
        students.put("Susan", Susan);
        students.put("Nick", Nick);

    }
    private static void welcome() {
        System.out.printf("Welcome!\n");
        String usernames = "|";
        for (String key : students.keySet())
            usernames += " " + key + " |";
        System.out.printf("\n" +
                "Here are the github usernames of our students:\n" +
                "\n" +
                usernames);
        System.out.println();
    }
    private static void outputStudentRecord(String key) {
        // compare studentChoice with usernames
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - Github Username: %s%n", students.get(key).getName(),key);
            System.out.printf("Current Average: %.2f%n%n", students.get(key).getGradeAverage());
            // output student record
        } else {
            System.out.printf("Sorry, no student found with the github username of \"%s\".%n", key);
        }

    }

    public static void main(String[] args) {
        Input input = new Input();
        init();
        welcome();
        boolean keepGoing = true;

        do {
            System.out.println("What student would you like to see more information on?");
            String studentChoice = input.getString();
            System.out.println();

            outputStudentRecord(studentChoice);

            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
            System.out.println();
        } while (keepGoing);
    }
}