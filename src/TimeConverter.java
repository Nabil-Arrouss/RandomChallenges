public class TimeConverter {
    public static void main(String[] args) {
        // Method call to print years and days
        printYearsAndDays(1000000000);
    }

    // Method to convert seconds into a formatted duration string
    public static String getDuration(int seconds) {
        if (seconds >= 0) {
            int h = seconds / 3600; // Calculate hours
            int m = (seconds % 3600) / 60; // Calculate minutes
            int s = seconds % 60; // Calculate seconds
            return h + "h " + m + "m " + s + "s"; // Return formatted duration string
        }
        return "Invalid Value inserted!"; // Return error message for negative input
    }

    // Method to print years and days from minutes
    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            long hours = minutes / 60; // Convert minutes to hours
            long days = hours / 24; // Convert hours to days
            long years = days / 365; // Convert days to years
            days %= 365; // Calculate remaining days after years
            System.out.println(minutes + " min = " + years + " years and " + days + " days."); // Print result
        } else {
            System.out.println("Invalid input!"); // Print error message for negative input
        }
    }
}
