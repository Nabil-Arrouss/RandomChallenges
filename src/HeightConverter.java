public class HeightConverter {
    public static void main(String[] args) {
        System.out.println("You are: " + convertToCentimeters(19) + " cm!");
        System.out.println("You are: " + convertToCentimeters(5, 10) + " cm!");
    }

    // Method-1: Converts inches to centimeters
    public static double convertToCentimeters(int inches) {
        return inches * 2.54d; // Convert from inches to centimeters
    }

    // Method-2: Converts feet and inches to centimeters
    public static double convertToCentimeters(int feet, int inches) {
        double feetToInch = feet * 12; // Convert feet to inches
        double totalInches = feetToInch + inches; // Add the inches given to the total inches
        return convertToCentimeters((int) totalInches); // Convert total inches to centimeters
    }
}
