import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        Convert given number grades into letter grades.
            Scanner scanner = new Scanner(System.in);//        Prompt the user for a numerical grade from 0 to 100.
            System.out.print("Enter a numerical grade between 0 & 100: ");
            String userInput = scanner.next();
            int numInput = Integer.parseInt(userInput);
            System.out.println("You entered: " + numInput);

//        Display the corresponding letter grade.
        if(numInput <= 100 && numInput >= 88){
            System.out.println("A : " + numInput);
        } else if (numInput <= 87 && numInput >= 80) {
            System.out.println("B : " + numInput);
        } else if (numInput <= 79 && numInput >= 67) {
            System.out.println("C : " + numInput);
        } else if (numInput <= 66 && numInput >= 60) {
            System.out.println("D : " + numInput);
        } else {
            System.out.println("F : " + numInput);
        }
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//

    }
}
