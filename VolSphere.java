import java.util.Scanner;

/**
* Get volume of sphere from user input in java.
* @author  Jack Turcotte
* @version 1.0
* @since   2025-09-05
*/

// Defines the class
public final class VolSphere {

    /**
     * This is a private constructor used to
     * satisfy the style checker.
     * @exception IllegalStateException Utility Class
     * @see IllegalStateException
     */
    private VolSphere() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main method.
     *
     * @param args Unused.
     */

    // Get input, calculate volume and display to user

    public static void main(final String[] args) {
        // Get user input
        System.out.println("Jack's volume of a Sphere Calculator");
        System.out.println("Enter the radius of the sphere (cm): ");

        // Create scanner, get input
        final Scanner scanner = new Scanner(System.in);
        final String radiusString = scanner.nextLine();

        final double radiusDouble = Double.parseDouble(radiusString);

        // Check if radius is > 0
        if (radiusDouble <= 0) {

            // Warn input not in possible range
            System.out.println("Please enter a positive radius");
        } else {

            // Calculate the volume
            final double volume = (4 / 3) * Math.PI * Math.pow(radiusDouble, 3);
            System.out.println("The volume of a sphere with radius "
                + radiusDouble + " cm is " + volume + " cm3");
        }
        scanner.close();
    }
}
