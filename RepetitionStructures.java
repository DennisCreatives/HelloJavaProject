public class RepetitionStructures {
    /**
     * Repetition Control Structures
     *
     * are java statements that allow us to execute specific blocks of code a number of times
     *
     * there are 3 types namely:-
     *
     * 1. while-loop
     * 2. do-while loop
     * 3. for-loop
     */

    public static void main(String[] args) {

        // 1. while-loop -> is a statement or block of code that is repeated as long as some condition is satisfied.

        // while loop has the form (syntax)

        // while (boolean_expression) {
        //    statement1;
        //    statement2;
        // }

        // The statements inside the while loop are executed as long as the boolean_expression evaluates to true

        // Example:
        // write a while loop that prints the integers 1 2 3 4 5 6 7 8 9 10

        int x = 1;

        // repeat as long as the value of x is less than or equal to 10
        while (x < 11) {
            System.out.println(x);
            // x++;
            // x += 1;
            x = x + 1;
        }

        System.out.println("======================================================");

        // output: 0 2 4 6 8 10 12 14 16 18 20
        int i = 0;

        while (i < 21) {
            System.out.println(i);
            // i = i + 2;
            i += 2;
        }

        System.out.println("======================================================");

        // Output: 15 12 9 6 3 0 -3 -6 -9 -12 -15

        int k = 15;

        while (k >= -15) {
            System.out.println(k);
            k = k - 3;
        }
        System.out.println("======================================================");

        // 2. do ... while
        // statements inside a do-while loop are executed several times as long as the condition is satisfied(true)

        // it is similar to a while loop, the main difference is that statements inside a so-while loop are executed at least once

        // syntax

        // do {
        //     statement1;
        //     statement2;
        // } while (boolean_expression);

        // output: 1 2 3 4 5 6 7 8 9 10

        int m = 1;

        do {
            System.out.println(m);
            m++;
        } while (m <= 10);

        System.out.println("======================================================");

        // 0 5 10 15 20 25 30 35 40 45 50
        // 50 45 40 35 30 25 20 15 10 5 0

        // tomorrow -> for-loop
        // 3. for loop

    }
}
