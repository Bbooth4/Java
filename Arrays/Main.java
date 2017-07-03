import java.util.Scanner;

public class Main {

  private static Scanner sc = new Scanner(System.in);
  // used like process.argv()
  public static void main(String[] args) {
    int[] integers = getIntegers(5);
    for(int i=0; i<integers.length; i++) {
      System.out.println("Element " + i + ", typed value was " + integers[i]);
    }
    System.out.println(getAverage(integers));

    int[] array = new int[10];
    array[5] = 50; 
    // element 6 is now 50, it is zero indexed
    int[] longArray = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

    double[] newArray = new double[10];
    System.out.println(array[5]);

    for(int i=0; i<array.length; i++) {
      array[i] = i*10;
    }
    printArray(array);
  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " Integer values.\r");
    int[] values = new int[number];

    for(int i=0; i<values.length; i++) {
      values[i] = sc.nextInt();
    }
    return values;
  }

  public static double getAverage(int[] array) {
    int sum = 0; 
    for(int i=0; i<array.length; i++) {
      sum += array[i];
    }

    return (double) sum/(double)array.length;
  }

  public static void printArray(int[] array) {
    for(int i=0; i<array.length; i++) {
      System.out.println("Element " + i + ", value is " + array[i]);
    }
  }
}