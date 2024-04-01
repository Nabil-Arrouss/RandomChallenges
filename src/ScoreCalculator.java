public class ScoreCalculator {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Nabil", 55));
        System.out.println("New score is " + calculateScore(44));
    }

    // Method declarations

    // Method-1: Calculates score for a player with a given name and score
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    // Method-2: Calculates score for an anonymous player with a given score
    public static int calculateScore(int score) {
        return calculateScore(" Anonymous ", score);
    }

    // Method-3: Default method when no player name and score are provided
    public static int calculateScore() {
        System.out.println("No player name, No player score.");
        return 0;
    }
}