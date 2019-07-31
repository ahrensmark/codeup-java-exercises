public class java_Practice {

// Defining a method using a string example
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

// Defining a method using a int(number) example
    public static int returnThree() {
        return 3;
    }


// main method is used to call methods
    public static void main(String[] args) {
    // call the sayHello method.
        sayHello("Mark" );
        System.out.println(sayHello("mark"));
    // call the returnThree method.
        returnThree();
        System.out.println((returnThree()));
    }


}
