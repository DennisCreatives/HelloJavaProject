import java.util.Scanner;

public class JavaArray {
    /**
     * Java Arrays
     *
     * What is an Array?
     *
     * Suppose we have three variables of type int with different identifiers for each variable.
     *
     * int number1;
     * int number2;
     * int number3;
     *
     * number1 = 1;
     * number2 = 2;
     * number3 = 3;
     *
     * As you can see, it seems like a tedious task in order to just initialize and use the variables especially if they are for the same purpose.
     *
     * In Java and other programming languages, there is one capability wherein we can use one variable to store a list of data and manipulate them more efficiently. This type of variable is called an array.
     *
     * An array stores multiple data items of the same data type, in a contiguous block of memory, divided into a number of slots.
     *
     *
     * Declaration of an Array
     *
     * Declaring Arrays
     *
     * To declare an array, write the data type, followed by a set of square brackets [], followed by the identifier name.
     *
     * For example: int[] ages; or int ages[];
     *
     * Instantiation of an Array
     *
     * Array Instantiation
     * After declaring, we must create the array and specify its length with a constructor statement.
     *
     * Definition:
     * Instantiation -> in Java, this means creation.
     * Constructor -> In order to instantiate an object, we need to use a constructor for this. A constructor is a method that is called to create a certain object.
     * we will cover more about instantiating objects and constructors
     *
     * To instantiate (or create) an array, write the 'new' keyword, followed by the square brackets containing the number of items elements you want the array to have.
     *
     */

    public static void main(String[] args) {
        // for example:
        // declaration
        int ages[];

        // instantiate object
        ages = new int[100];

        // or, can also be written as
        // declare and instantiate object
        // int ages[] = new int[100];

        // You can also instantiate an array by directly initializing it with data
        // For Example:
        int[] arr = {1, 2, 3, 4, 5};

        // The statement above declares and instantiates an array of integers with five elements (initialized to the values 1, 2, 3, 4, and 5

        // boolean array
        boolean[] results = { true, false, true, false };

        // double array
        double[] grades = { 100, 90, 80, 75};

        // string array
        String[] days = { "Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun" };

        // Accessing Array Element
        // To access an array element, or part of the array, you use a number called an 'index' or a 'subscript'
        // index number or subscript:
        // -> is assigned to each member of the array, to allow the program to access an individual member of the array.
        // -> begins with zero and progress sequentially by whole numbers to the end of the array.
        // NOTE: Elements inside your array are from 0 to (sizeOfArray - 1)

        // For Example: given the array we declared a while ago, we have

        // assigns 10 to the first element in the array
        ages[0] = 10;

        // prints the last element in an array
        System.out.println(ages[99]);

        // Note: Once an array is declared and constructed, the store value of each member of the array will be initialized to zero for number data type
        // For Reference data types like Strings, they are NOT initialized to blanks or an empty string "". Therefore, you must populate the String array explicitly.

        // Example
        // The following is a sample code on how to print all the elements in the array. It uses a for loop -> Print all the elements of ages[] array
        // solution

        for (int w = 0; w < ages.length; w++) {
            System.out.println(ages[w]);
        }

        // write a java program that will ask the user to enter the names of 5 students and store them in an array. Then output all the names using a for a loop.

        // create an empty array to store the 5 names
        String[] names = new String[5];

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the 5 names
//        System.out.print("Student 1 name: ");
//        System.out.print("Student 2 name: ");
//        System.out.print("Student 3 name: ");
//        System.out.print("Student 4 name: ");
//        System.out.print("Student 5 name: ");
        for (int idx = 0; idx < names.length; idx++ ){
            System.out.println("Enter the name of student " + (idx + 1) + ": ");
            names[idx] = sc.next();
        }

        for (int l = 0; l < names.length; l++) {
            System.out.println(names[l]);
        }

        // Array Length
        // In order to get the number of elements in an array, you can use the length field of an array.
        // The length field returns the size of the array.
        // It can be used by writing the following
        // arrayName.length
        // Example:
        System.out.println(names.length);

        // Create a program that asks the user for 5 integers and then prints out their sum and average
        int[] numbers = new int[5];

        for (int num = 0; num < numbers.length; num++){
            System.out.print("Enter 5 Integers: ");
            numbers[num] = sc.nextInt();
        }

        int sum = 0;
        int average = 0;

        // use a for loop to calculate the sum and average
        for (int n = 0; n < numbers.length; n++) {
            sum = sum + numbers[n];
        }

        // compute the average
        average = sum / numbers.length;

        // output the sum and average
        System.out.println("The Sum of the 5 integers is: " + sum);
        System.out.println("The Average of the 5 integers is: " + average);

        // Multi-Dimensional Array
        // are implemented as arrays of arrays
        // are declared by appending the appropriate number of bracket pairs after the array name.
        // syntax: (2-D Array)
        // type[][] arrayName = new type[row][column];

        // Example:
        // a 2D integer Array 512 x 128 elements
        int[][] twoD = new int[512][128];

        // a 3D char Array (8 x 16 x 24)
        char[][][] threeD = new char[8][16][24];

        // a 2D String Array 4rows by 2 columns
        String[][] dogNames = {
                {"terry", "brown"},
                {"kristin", "white"},
                {"toby", "gray"},
                {"fido", "black"}
        };

        // Accessing elements of a Multidimensional array
        // To access an element in a multidimensional array is just the same as accessing the elements in a one dimensional array
        // For example:
        // To access the first element in the first row o the array dogNames, we write the following

        System.out.println(dogNames[0][0]);

        // This will print the String "Terry" on the screen

        // Challenge:
        // Create a java program to track the grades of students across multiple subjects using a 2D array. Implement the following functions to:
        // -> input grades for each student in each subject
        // -> calculate and display the average grade for each student
        // calculate and display average grade for each subject


        // Create variables to store the number of students and number of subjects
        int numStudents;
        int numSubjects;

        // Prompt the user to for the numbers and store them in their appropriate arrays
        System.out.print("Enter Number of Students: ");
        numStudents = sc.nextInt();

        System.out.print("Enter Number of Subjects: ");
        numSubjects = sc.nextInt();

        // create an array to store grades (2D Array)
        int[][] studentGrades = new int[numStudents][numSubjects];

        // input grades (using nested for-loops)
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter Grades for Student " + (i + 1) + ": ");
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Enter Grade for Subject " + (j + 1) + "; ");
                studentGrades[i][j] = sc.nextInt();
            }
        }

        // calculate the average grade for each student and output it
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += studentGrades[i][j];
            }
            // create a variable for the average grade
            double averageStudent = (double) total / numSubjects;
            // output the average
            System.out.println("Average Grade for Student: " + (i + 1) + ": " + averageStudent);
        }

        // calculate the average grade for each subject and output it
        for (int j = 0; j < numSubjects; j++) {
            int total = 0;
            for (int i = 0; i < numStudents; i++) {
                total += studentGrades[i][j];
            }
            double averageSubject = (double) total / numStudents;
            System.out.println("Average Grade for Subject: " + (j + 1) + ": " + averageSubject);
        }


    }
}
