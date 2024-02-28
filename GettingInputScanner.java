import java.util.Scanner;

public class GettingInputScanner {

    public static void main(String[] args){

        // create a Scanner object
        Scanner sc = new Scanner(System.in);

        // declare our variables
        String userName = "";
        int userAge;

        // ask the user for their name
        System.out.print("Please enter your name: ");
        userName = sc.next();

        // ask the user for their age
        System.out.print("Enter your age too: ");
        userAge = sc.nextInt();

        // output the data
        System.out.println("Hello " + userName + ", you are " + userAge + " years old.");

        // close the object object
        sc.close();
    }

}
