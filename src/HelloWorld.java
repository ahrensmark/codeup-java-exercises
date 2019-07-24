public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Codeup!");

        int myFavoriteNumber = 37;
        System.out.println(myFavoriteNumber);

        String myString = "Mark";
        System.out.println(myString);

//        myString = 'k';
//        System.out.println(myString);
//
//        myString = 40;
//        System.out.println(myString);

//        long myNumber = 3.14;
//        System.out.println(myNumber);

//        long myNumber = 123L;
//        System.out.println(myNumber);

//        long myNumber = 123;
//        System.out.println(myNumber);

//        int myNumber = 3.14;
////        System.out.println(myNumber);

        float myNumber = 3.14f;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        //int class = 'alkjsdf';

        String theNumberThree = "three";
        Object o = theNumberThree;
        //int three = (int) o;
        //int three = (int) "three";
        System.out.println(o);

        byte a = 126;
        a += 5;
        System.out.println(a);

        int b = 3;
        int c = 4;
        b *= c;
        System.out.println(b);

        int d = 10;
        int e = 2;
        d /= e;
        e -= d;
        System.out.println(d);
        System.out.println(e);
    }
}
//

//    Try to create a variable named class. What happens?
//
//    Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//
//
//    String theNumberThree = "three";
//    Object o = theNumberThree;
//    int three = (int) o;
//    Copy and paste the code above and then run it. Does the result match with your expectation?
//
//    How is the above example different from the code block below?
//
//
//    int three = (int) "three";
//    What are the two different types of errors we are observing?
//
//    Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//    int x = 4;
//    x = x + 5;
//
//    int x = 3;
//    int y = 4;
//    y = y * x;
//
//    int x = 10;
//    int y = 2;
//    x = x / y;
//    y = y - x;

//    What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//    Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.


//   1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
//    Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
//    Change your code to assign a character value to myString. What do you notice?
//
//    Change your code to assign the value 3.14159 to myString. What happens?
//
//    Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//    Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//    Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//    Change your code to assign the value 123 to myNumber.

//    Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//    Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//
//    Copy and paste the following code blocks one at a time and execute them
//
//
//    int x = 5;
//System.out.println(x++);
//System.out.println(x);
//
//    int x = 5;
//System.out.println(++x);
//System.out.println(x);
//    What is the difference between the above code blocks? Explain why the code outputs what it does.