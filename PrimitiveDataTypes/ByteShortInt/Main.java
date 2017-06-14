public class Main {
  public static void main(String[] args) {
    // 8 width
    // undefined numbers (like 2 below) is automatically an int, you must specify that you want it to be a byte, short or long in () ahead of it
    byte byteMax = 127;
    byte b = (byte) (byteMax/2);

    // 16 width
    // must use () to convert shorts if combined with other numbers 
    short shortMax = 32767;

    // 32 width 
    int  intMax = 2_147_483_647;
    int intMin = -2_147_483_647;

    int i = intMax/2;

    // 64width, must end with an L or l
    long longValue = 100L;
    long longMax = 9_223_372_036_854_775_807L;

    System.out.println(b);
    System.out.println(i);

    byte a = 2;
    short s = 3;
    int d = 4;

    // long will convert without the ()
    long f = 50_000L + 10 * (a + s + d);

    System.out.println(f);

  }
}