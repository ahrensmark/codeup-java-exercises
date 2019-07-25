import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        Display a table of powers.
//
//        Prompt the user to enter an integer.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        String num = scanner.next();
        long input = Integer.parseInt(num);
        System.out.println("You entered: " + input);
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        long i = 1;
        do {
            System.out.println("  " + i + "    |   " + i*i + "     |   " + i*i*i);
            i++;
        } while (i <= input);


    }
}
