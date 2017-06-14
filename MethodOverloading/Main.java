public class Main {
  public static void main(String[] args) {
    int newScore = calculateScore("Steve", 500);
    System.out.println("New score is " + newScore);
    calculateScore(75);
    calculateScore("Steve", 100);
    calculateScore();

    double one = calcFeetAndInchesToCentimeters(10, 8);
    System.out.println(one);

    double two = calcFeetAndInchesToCentimeters(100);
    System.out.println(two);
  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score + 1000;
  }

  public static int calculateScore(int score) {
    System.out.println("Unamed player scored " + score + " points");
    return score + 1000;
  }

  public static int calculateScore() {
    System.out.println("Unamed player scored points");
    return 0;
  }

  // can have the same method name as long as there are a different number of required parameters

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet >= 0 && inches >= 0 && inches <= 12) {
      double one = 30.48 * feet;
      double two = 2.54 * inches;
      return one + two;
    }
    return -1;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches >= 0) {
      double feet = (int) inches / 12;
      double remainingInches = (int) inches % 12;
      System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
      return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
    return -1;
  }
}