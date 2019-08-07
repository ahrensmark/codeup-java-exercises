package util;

import java.util.Scanner;
// A Class is a blueprint that is used to create Object. The Class defines what object can do.  Core properties include the data types and methods that may be used by the object.
//A Java object is a combination of data and procedures working on the available data. An object has a state and behavior. The state of an object is stored in fields (variables), while methods (functions) display the object's behavior. Objects are created from templates known as classes.
public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return this.getString();
    }

    public boolean yesNo() {
        String answer = this.scanner.nextLine();
        if (answer.equalsIgnoreCase("Y")
                || answer.equalsIgnoreCase("Yes")) {
            return true;
        } else return false;
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return this.yesNo();
    }

    public int getInt(int min, int max) {
        do {
            System.out.printf("Enter a number between %d and %d : ", min, max);
            String input = this.scanner.nextLine();
            int answer;
            try {
                answer = Integer.valueOf(input);
            } catch (NumberFormatException ex) {
                continue;
            }

            if (answer >= min && answer <= max) {
                return answer;
            }
        } while (true);
    }

    public int getInt() {
        return this.scanner.nextInt();
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.getInt();
    }

    public double getDouble(double min, double max) {
        do {
            System.out.printf("Enter a number between %.2f and %.2yf : ", min, max);
            String input = this.scanner.nextLine();
            double answer;
            try {
                answer = Double.valueOf(input);
            } catch (NumberFormatException ex) {
                continue;
            }
            if (answer >= min && answer <= max) {
                return answer;
            }
        } while (true);

    }
    public double getDouble() {
        return this.scanner.nextDouble();
    }
    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.getDouble();
    }


//    Research the .valueOf method on the Integer class. You will find that it can also be used to parse integers in different bases. Use this functionality to create two new methods, getBinary and getHex that will accept a string that is a number in binary or hexadecimal.

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter your answer (Y/N)?");
        System.out.println(input.yesNo());
        //System.out.println(input.getInt(1,10));
        System.out.println(input.getDouble(1,10));
    }
}


