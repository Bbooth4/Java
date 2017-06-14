public class Main {
  public static void main(String[] args) {
    int result = 1 + 2;
    System.out.println(result);

    int previousResult = result;

    result = result - 1;
    System.out.println(result);

    previousResult = result;

    result = result * 10;
    System.out.println(result);

    previousResult = result;

    result = result / 5;
    System.out.println(result);

    previousResult = result;

    result = result % 3;
    System.out.println(result);

    previousResult = result;

    // ++ -- == += -= *= /= > < >= <= != && || ? : % %=
    // bitwise & | (inclusive or) ^ (exclusive or)

    // shift operators 
    // << the same as multiply by 2
    // >> the same as divide by 2 
    // >>> shifts a 0 into the left most position for binary
    // <<< shifts a - into the right most position for binary

    boolean isPerson = false;
    if (isPerson == false)
      System.out.println("It is not a person.");

  }
}