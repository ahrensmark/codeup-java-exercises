import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        Copy this code into your main method:
//        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
//        The value of pi is approximately 3.14.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f. \n", pi);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("You entered: --> \"" + number + "\" <--");
        //System.out.format("My number is %d.2f \n", number);

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.


//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?
        System.out.print("Enter three word: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("My first word is: " + word1);
        System.out.println("My second word: " + word2);
        System.out.println("My final word is: " + word3);

        //        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        System.out.println("Please enter a sentence: ");
        scanner.nextLine();
        String mySentence = scanner.nextLine();
        System.out.printf("Here is your sentence: %s%n", mySentence);


//        Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup.
        System.out.print("Enter room width: ");
        String widthAnswer = scanner.nextLine();
        double width = Double.valueOf(widthAnswer);
        System.out.print("Enter room length: ");
        String lengthAnswer = scanner.nextLine();
        double length = Double.valueOf(lengthAnswer);
        double area = width * length;
        double volume = width * length * 10;
        System.out.format("Area of room is %s \n", area);
        System.out.format("Perimeter of room is %.2f%n", (2 * width) + (2 * length));
        System.out.format("Area of room is %s \n", volume);


    }
}
//        Bonuses
//
//        Accept decimal entries.
//        Calculate the volume of the rooms in addition to the area and perimeter.
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.