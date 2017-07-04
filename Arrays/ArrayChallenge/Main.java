import java.util.Scanner;

public class Main {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int[] a1 = integers(1, 2, 3, 4, 5);
    int[] a2 = sortIntegers(integers(5, 2, 4, 6, 1));

    // printArray(a1);
    printArray(a2);

  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values.\r");
    int[] values = new int[number];

    for(int i=0; i<values.length; i++) {
      // values[i] = sc.nextInt();
    }
    return values;
  }

  public static int[] integers(int n1, int n2, int n3, int n4, int n5) {
    int[] array = { n1, n2, n3, n4, n5 };
    return array;
  }

  // public static void printArray(int[] array) {
  //   System.out.println(Arrays.toString(array));
  // }

  public static void printArray(int[] array) {
    for(int i=0; i<array.length; i++) {
      System.out.println("Element " + i + ", value is " + array[i]);
    }
  }

  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = new int[array.length];
    for(int i=0; i<array.length; i++) {
      sortedArray[i] = array[i];
      // creates a new array, like a map 
    }

    boolean flag = true; 
    int temp;
    while (flag) {
      flag = false; 
      for(int i=0; i<sortedArray.length-1; i++) {
        if (sortedArray[i] < sortedArray[i+1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i+1];
          sortedArray[i+1] = temp; 
          flag = true; 
        }
      }
    }
    return sortedArray;
    // [i+1] means the next index, if i < [i+1] then it will continue to shift if over until each variable on the right is larger than each varaible on the left

    // for(int i=0; i<array.length; i++) {
    //   int highestNumber = 0;
    //   if (i > highestNumber) {
    //     highestNumber = i;
    //     array[0] = i;
    //   } else if (i> i-1) {
    //     array[i] = i;
    //   }
    // }
    // return array; 
  }

}