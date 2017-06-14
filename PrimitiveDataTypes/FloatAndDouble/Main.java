public class Main {
  public static void main(String[] args) {
    int intValue = 5;

    // the f is required for floats 
    // width 32
    float floatValue = 5.25f;

    // can use the d or use nothing
    // width 64
    // doubles actually run much faster on modern computers, in built functions in java use doubles
    double doubleValue = 5.25d;

    double d = floatValue + doubleValue;

    // floats and doubles return remainders, ints round up
    // floats have 7 decimals
    // doubles have 16 decimals 
    System.out.println(d);

    double pounds = 20;
    double kilogramPerPound = 0.45359237;

    double total = pounds * kilogramPerPound;

    System.out.println(total);
  }
}