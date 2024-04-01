public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("The area of the circle is: " + area(5.0));
        System.out.println("The area of the rectangle is: " + area(5.0, 4.0));
    }

    // Method to calculate the area of a circle
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0; // Return -1 for invalid radius
        }
        return radius * radius * Math.PI; // Calculate and return area
    }

    // Method to calculate the area of a rectangle
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0; // Return -1 for invalid side lengths
        }
        return x * y; // Calculate and return area
    }

    // Method to print whether numbers are equal or different
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value!"); // Print message for invalid inputs
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal!"); // Print message for equal numbers
        } else if (a == b || a == c || b == c) {
            System.out.println("Neither all are equal or different!"); // Print message for partially equal numbers
        } else {
            System.out.println("All numbers are different!"); // Print message for different numbers
        }
    }
}
