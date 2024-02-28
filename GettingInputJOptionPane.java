import javax.swing.*;

public class GettingInputJOptionPane {
    public static void main(String[] args){
        // create a variable to store the username
        String userName = "";

        // ask the user for their name
        userName = JOptionPane.showInputDialog("Please enter your name");

        // create the output message
        String msg = "Hello " + userName + "!";

        // output the user data
        JOptionPane.showMessageDialog(null, msg);


        // write a java program that gets the radius of a circle form the user and then output in a Messagebox, the perimeter and area of that circle.

        // convert string to a float -> Float.parseFloat(someValue)
        // convert string to an integer -> Integer.parseInt(someValue)

        float PI = 3.13F;

        String radius = JOptionPane.showInputDialog("Enter the radius");
        float floatRadius = Float.parseFloat(radius);

        // calculate the perimeter
        float perimeter = PI * (floatRadius + floatRadius);

        // calculate the area
        float area = PI * (floatRadius * floatRadius);

        // create the output
        String output = "Perimeter: " + perimeter + "\n" + "Area: " + area;

        // output the area and perimeter
        JOptionPane.showMessageDialog(null, output);

    }
}
