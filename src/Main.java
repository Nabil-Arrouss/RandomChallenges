public class Main {
    public static void main(String[] args) {
        // Creating instances of the classes
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        TeenChecker teenChecker = new TeenChecker();
        TimeConverter timeConverter = new TimeConverter();

        HeightConverter heightConverter = new HeightConverter();
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        // Testing methods from ScoreCalculator class
        System.out.println("Score: " + scoreCalculator.calculateScore("Nabil", 55));
        System.out.println("Score: " + scoreCalculator.calculateScore(44));

        // Testing methods from TeenChecker class
        boolean hasTeen = teenChecker.hasTeen(12, 1, 90);
        System.out.println("Has Teen: " + hasTeen);
        boolean isEqual = teenChecker.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("Equal by three decimal places: " + isEqual);
        boolean hasEqualSum = teenChecker.hasEqualSum(1, 2, 3);
        System.out.println("Has equal sum: " + hasEqualSum);
        boolean shouldWakeUp = teenChecker.shouldWakeUp(true, 9);
        System.out.println("Should wake up: " + shouldWakeUp);

        // Testing methods from TimeConverter class
        System.out.println("Duration: " + timeConverter.getDuration(3600));
        System.out.println("Duration: " + timeConverter.getDuration(61));

        // Testing methods from HeightConverter class
        System.out.println("Height in centimeters: " + heightConverter.convertToCentimeters(5, 10));

        // Testing methods from ShapeCalculator class
        System.out.println("Area of circle: " + shapeCalculator.area(5.0));
        System.out.println("Area of rectangle: " + shapeCalculator.area(5.0, 4.0));
    }
}
