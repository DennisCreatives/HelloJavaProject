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

    }
}
