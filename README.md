# Random Challenges 1

This is a Java utility repository containing various challenge solutions.

## ScoreCalculator

The `ScoreCalculator` class provides methods to calculate scores based on different parameters.

### Methods

- `calculateScore(String playerName, int score)`: Calculates the score for a player with the given name and score.
- `calculateScore(int score)`: Calculates the score for an anonymous player with the given score.
- `calculateScore()`: Returns a default score of 0 for an anonymous player with no score.

## TeenChecker

The `TeenChecker` class provides methods to check if given numbers are within the teenage range.

### Methods

- `shouldWakeUp(boolean isBarking, int hourOfDay)`: Checks if a dog should wake up based on whether it is barking and the hour of the day.
- `areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble)`: Checks if two doubles are equal up to three decimal places.
- `hasEqualSum(int num1, int num2, int num3)`: Checks if the sum of the first two numbers equals the third number.
- `hasTeen(int num1, int num2, int num3)`: Checks if at least one of the given numbers is a teenager.
- `isTeen(int num)`: Checks if the given number is a teenager.

## TimeConverter

The `TimeConverter` class provides methods to convert time between different units.

### Methods

- `getDuration(int seconds)`: Converts seconds into a formatted duration string.
- `printYearsAndDays(long minutes)`: Prints the number of years and days equivalent to the given number of minutes.

## CoinCounter

The `CoinCounter` class provides methods to count and display coins for a given total amount in cents.

### Methods

- `countCoins(int totalCents)`: Counts and displays the number of quarters, dimes, nickels, and cents for a given total amount in cents.

## HeightConverter

The `HeightConverter` class provides methods to convert height between different units.

### Methods

- `convertFeetToInches(int feet)`: Converts feet to inches.
- `convertInchesToFeet(int inches)`: Converts inches to feet.

## ShapeCalculator

The `ShapeCalculator` class provides methods to calculate the area of different shapes.

### Methods

- `calculateCircleArea(double radius)`: Calculates the area of a circle with the given radius.
- `calculateRectangleArea(double length, double width)`: Calculates the area of a rectangle with the given length and width.

## Main Method 

The `Main` class serves as the entry point for running tests on the utility methods provided in this repository. It contains sample test cases for each utility method. You can run the `Main` class to execute these test cases and verify the functionality of each method.
