public class TeenChecker {
    public static void main(String[] args) {
        // Method calls
        boolean hasteen = hasTeen(12, 1, 90);
        System.out.println(hasteen);

        boolean wakeup = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(wakeup);

        boolean isequal = hasEqualSum(1, 2, 3);
        System.out.println(isequal);

        boolean dogisbarking = shouldWakeUp(true, 9);
        System.out.println(dogisbarking);
    }

    // Method to check if the dog should wake up based on barking and time
    public static boolean shouldWakeUp(boolean isbarking, int houroftheday) {
        if (isbarking && (houroftheday > 22 || houroftheday < 8)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check if two doubles are equal to three decimal places
    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble) {
        int myFirstCheck = (int) (myFirstDouble * 1000);
        int mySecondCheck = (int) (mySecondDouble * 1000);
        return myFirstCheck - mySecondCheck == 0;
    }

    // Method to check if the sum of two numbers is equal to the third number
    public static boolean hasEqualSum(int n1, int n2, int n3) {
        int sum = n1 + n2;
        return sum == n3;
    }

    // Method to check if any of the numbers is a teen number
    public static boolean hasTeen(int n1, int n2, int n3) {
        return isTeen(n1) || isTeen(n2) || isTeen(n3);
    }

    // Method to check if a number is a teen number
    public static boolean isTeen(int n1) {
        return n1 >= 13 && n1 <= 19;
    }
}
