public class ControlFlowExercises {
    public static void main(String[] args) {


//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
//
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
//        For
//
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 100);

        int a=100;
        do {
            System.out.println(a);
            a -= 5;
        } while (a >= -10);

        long b = 2;
        //int c = 1;
        do {
            System.out.println(b);
            b = b * b;
        } while (b < 1000000);


//        Refactor the previous two exercises to use a for loop instead.

        for(int l = 5; l <= 15; l += 1) {
            System.out.println(l);
        }

        for(int m = 0; m <= 100; m += 2){
            System.out.println(m);
        }

        for(int o = 100; o >= -10; o -= 5) {
            System.out.println(o);
        }

        for(long p = 2; p < 1000000; p *= p) {
            System.out.println(p);
        }

    }
}
