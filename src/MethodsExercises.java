

import java.util.Scanner;

    //        public class MethodsExercises {
// Addition
//                public static int Addition(int a, int b) {
//                    return a + b;
//                }
//                public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                    System.out.print("Enter first number: ");
//                int a = sc.nextInt();
//                    System.out.print("Enter second number: ");
//                int b = sc.nextInt();
//
//                    System.out.println(Addition(a, b));
//            }
//}
// Subtraction
//                public static int Substraction(int i, int j) {
//                    return i - j;
//                }
//
//                public static void main(String[] args) {
//                    Scanner sc=new Scanner(System.in);
//                    System.out.print("Enter first number: ");
//                    int i=sc.nextInt();
//                    System.out.print("Enter second number: ");
//                    int j=sc.nextInt();
//
//                    System.out.println(Substraction(i,j));
//                }
//            }

//Multiplication
//            public static int Multiplication(int i, int j) {
//                    return i * j;
//                }
//
//                public static void main(String[] args) {
//                    Scanner sc=new Scanner(System.in);
//                    System.out.print("Enter first number: ");
//                    int i=sc.nextInt();
//                    System.out.print("Enter second number: ");
//                    int j=sc.nextInt();
//
//                    System.out.println(Multiplication(i,j));
//                }
//            }

                //Recursion
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion

//                   public static void Multiplication(int i, int j) {
//                       if (i < 1)
//                           return;
//                       else {
//                           Scanner sc=new Scanner(System.in);
//                           System.out.print("Enter first number: ");
//                           int i=sc.nextInt();
//                           System.out.print("Enter second number: ");
//                           int j=sc.nextInt();
//                           int k = i * j;
//                           //System.out.printf("%d ", test);
//                           Multiplication(test - 1); // statement 2
//                           System.out.printf("%d ", test);
//                           return;
//                       }
//
//                   }
//                        public static void main(String[] args)
//                        {
//                            //int test = 3;
//                            Multiplication(3);
//                        }
//                    }

// This code is contributed by
// Smitha Dinesh Semwal

//Division
//            public static double Division(double i, double j) {
//                return i / j;
//            }
//
//                public static void main(String[] args) {
//                    Scanner sc=new Scanner(System.in);
//                    System.out.print("Enter first number: ");
//                    double i=sc.nextInt();
//                    System.out.print("Enter second number: ");
//                    double j=sc.nextInt();
//
//                    System.out.println(Division(i,j));
//                }
//            }

// Modulus
//            public static int modulus(int i, int j) {
//             return i % j;
//}
//
//                public static void main(String[] args) {
//                    Scanner sc=new Scanner(System.in);
//                    System.out.print("Enter first number: ");
//                    int i=sc.nextInt();
//                    System.out.print("Enter second number: ");
//                    int j=sc.nextInt();
//
//                    System.out.println(modulus(i,j));
//                }
//            }


//


//     2. Create a method that validates that user input is in a certain range
//
//        The method signature should look like this:
//
//
//                public static void getInteger(int min, int max); {
//                    if(min < 1 && max > 10) {
//                        System.out
//                } else if (min >= 1 && max <= 10){
//                        return()
//                    }
////
//                public static void main(String[] args) {
//                    Scanner sc=new Scanner(System.in);
//                    System.out.print("Enter a number between 1 and 10: ");
//                    int userInput = getInteger(1, 10);
//
//                }
//            }
//        If the input is invalid, prompt the user again.

//      #3   Calculate the factorial of a number.
//
//                Prompt the user to enter an integer from 1 to 10.
//                Display the factorial of the number entered by the user.
//                Ask if the user wants to continue.
//                Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//                Use the long type to store the factorial.
//                Continue only if the user agrees to.
//                A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//
//
//                        1! = 1               = 1
//                        2! = 1 x 2           = 2
//                        3! = 1 x 2 x 3       = 6
//                        4! = 1 x 2 x 3 x 4   = 24


