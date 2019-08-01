
import java.util.Scanner;
public class MethodsExercises {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, int b) {
        //return a * b;
        //using loop for repeated addition
//        double result = 0;
//        for (int i = 0; i< b; i++) {
//            result += a;
//        }
//        return result;

        //using recursion for repeated addition
        if (b <= 0) return 0;
        return a + multiply(a, b-1);
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }

//    [visibility ownership] ReturnType methodName(ParamType paramName, ...) {
//        // yada yada
//        ReturnType something;
//        return something;
//    }

    public static int getInteger(int min, int max) {
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        answer = scanner.nextInt();
//        System.out.println();
        if (answer < min || answer > max) return getInteger(1,10);

        return answer;
    }


    public static void factorialGame() {
        Scanner scanner = new Scanner(System.in);
        do {
            int fact = getInteger(1, 10);

            factorialChart(fact);

            System.out.println("Wanna play again?");
            if (!scanner.nextLine().toUpperCase().contains("Y")) return;
        } while (true);
    }

    public static void factorialChart(int num) {

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = 1;
            System.out.print(i + "! = ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) System.out.print(" x ");
                else {
                    for (int k = 1; k <= (num - i); k++) System.out.print("    ");
                    if (num > 9 && i <=9) System.out.print("  ");
                }
                factorial *= j;
            }
            System.out.println(" = " + factorial);

        }
    }

    public static int rollDie(int sides){
        return (int) Math.ceil(Math.random() * sides);
    }

    public static void rollDice() {
        System.out.println("We will roll two dice, How many sides on each?");
        int sides = getInteger(1,6);
        int die1 = rollDie(sides);
        int die2 = rollDie(sides);
        System.out.printf("You rolled a %d and a %d.%n", die1, die2);
    }

    public static void main(String[] args) {
        System.out.println(add(3,17)); //expected 20
        System.out.println(subtract(10.1,2.7)); //expected 7.4
        System.out.println(multiply(.5, 5)); // expected 2.5
        System.out.println(divide(15,3.0)); // expected 5.0
        System.out.println(modulus(17.0, 5)); // expected 2
        System.out.println(divide(9,0));

        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1,10);
        Scanner scanner = new Scanner(System.in);

        do {
            userInput = scanner.nextInt();
            if (userInput >= 1 && userInput <= 10) break;
        } while (true);
        factorialGame();

        rollDice();
    }

}



//import java.math.*;
//import java.util.Scanner;
//public class MethodsExercises {
//
//// Addition
////                public static int Addition(int a, int b) {
////                    return a + b;
////                }
////                public static void main(String[] args) {
////                Scanner sc = new Scanner(System.in);
////                    System.out.print("Enter first number: ");
////                int a = sc.nextInt();
////                    System.out.print("Enter second number: ");
////                int b = sc.nextInt();
////
////                    System.out.println(Addition(a, b));
////            }
////}
//// Subtraction
////                public static int Substraction(int i, int j) {
////                    return i - j;
////                }
////
////                public static void main(String[] args) {
////                    Scanner sc=new Scanner(System.in);
////                    System.out.print("Enter first number: ");
////                    int i=sc.nextInt();
////                    System.out.print("Enter second number: ");
////                    int j=sc.nextInt();
////
////                    System.out.println(Substraction(i,j));
////                }
////            }
//
////Multiplication
////            public static int Multiplication(int i, int j) {
////                    return i * j;
////                }
////
////                public static void main(String[] args) {
////                    Scanner sc=new Scanner(System.in);
////                    System.out.print("Enter first number: ");
////                    int i=sc.nextInt();
////                    System.out.print("Enter second number: ");
////                    int j=sc.nextInt();
////
////                    System.out.println(Multiplication(i,j));
////                }
////            }
//
//
//    //Recursion
////        Create your Exponential method with recursion (Hint: a loop might be helpful).
//
//
////            public static int power(int base, int powerRaised) {
////                if (powerRaised != 0)
////                    return (base * power(base, powerRaised - 1));
////                else
////                    return 1;
////            }
////            public static void main(String[] args) {
////                int base = 3, powerRaised = 4;
////                int result = power(base, powerRaised);
////                System.out.printf("%d^%d = %d", base, powerRaised, result);
////            }
//
//    //Division
////                public static double Division(double i, double j) {
////                    return i / j;
////                }
////
////                public static void main(String[] args) {
////                    Scanner sc = new Scanner(System.in);
////                    System.out.print("Enter first number: ");
////                    double i = sc.nextInt();
////                    System.out.print("Enter second number: ");
////                    double j = sc.nextInt();
////
////                    System.out.println(Division(i, j));
////                }
//
//
//// Modulus
////            public static int modulus(int i, int j) {
////             return i % j;
////}
////
////                public static void main(String[] args) {
////                    Scanner sc=new Scanner(System.in);
////                    System.out.print("Enter first number: ");
////                    int i=sc.nextInt();
////                    System.out.print("Enter second number: ");
////                    int j=sc.nextInt();
////
////                    System.out.println(modulus(i,j));
////                }
////            }
//
//
////
//
//
//    //     2. Create a method that validates that user input is in a certain range
////
////        The method signature should look like this:
//
//
//
//
////    public static int getInteger(int min, int max) {
////        int answer;
////        Scanner scanner = new Scanner(System.in);
////        do {
////            if (answer >= min || answer <= max);
////                return answer;
////        } while(true);
////    }
////    public static void main(String[] args) {
////        System.out.print("Enter a number between 1 and 10: ");
////        int answer = getInteger(1, 10);
////        //System.out.println(answer);
////
////    }
////}
//
//
////        If the input is invalid, prompt the user again.
//
////      3.   Calculate the factorial of a number.
////
////                Prompt the user to enter an integer from 1 to 10.
////                Display the factorial of the number entered by the user.
////                Ask if the user wants to continue.
////                Use a for loop to calculate the factorial.
////                Assume that the user will enter an integer, but verify it’s between 1 and 10.
////                Use the long type to store the factorial.
////                Continue only if the user agrees to.
////                A factorial is a number multiplied by each of the numbers before it.
////                Factorials are denoted by the exclamation point (n!). Ex:
////
////
////                        1! = 1               = 1
////                        2! = 1 x 2           = 2
////                        3! = 1 x 2 x 3       = 6
////                        4! = 1 x 2 x 3 x 4   = 24
//
////    public static int factorial(int num) {
////        if (num == 1)
////            return num;
////        return num * factorial(num - 1);
////    }
////
////    public static void main(String args[]) {
////        Scanner sc = new Scanner(System.in);
////        do {
////        System.out.print("Enter an integer between 1 & 10: ");
////        long userInput = sc.nextInt();
////            if (userInput < 1 || userInput > 10) {
////                System.out.println("Number is not between 1 and 10");
////
////            } else if (userInput >= 1 && userInput <= 10){
////                for (int i = 1; i <= userInput; i++)
////
////                System.out.format("%s! = %s x %s    = %s\n", i, i, i, MethodsExercises.factorial(i));
////                System.out.print("Continue(Y/N)? ");
////                String confirm = sc.next().toLowerCase();
////                if (confirm.equals("n")) {
////                     break;
////                }
////            }
////        }while (true);
////    }
//
//
////                        1! = 1               = 1
////                        2! = 1 x 2           = 2
////                        3! = 1 x 2 x 3       = 6
////                        4! = 1 x 2 x 3 x 4   = 24
//
////      4.Create an application that simulates dice rolling.
////
////      Ask the user to enter the number of sides for a pair of dice.
////      Prompt the user to roll the dice.
////      "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
////      Use static methods to implement the method(s) that generate the random numbers.
////      Use the .random method of the java.lang.Math class to generate random numbers.
//
////        public static int rollDice(int r, int s) {
////
////        };
////
////        public static void main(String[] args) {
////
////        };
////        while (true)
////        {
////        int diceX=(int)(Math.random()*6+1);
////        int diceY=(int)(Math.random()*6+1);
////        int sum1 = diceX + diceY;
////        System.out.println("Roll: total = " + sum1);
////        if (sum1==2 || sum1==3 || sum1==12) {
////        System.out.println("Sorry with a " + sum1 + " You LOSE :(");
////        break;
////        } else if(sum1==7 || sum1==11) {
////        System.out.println("Woah!!! With a " + sum1 + " You WIN!!!!!!!");
////        break;
////        }
////       }