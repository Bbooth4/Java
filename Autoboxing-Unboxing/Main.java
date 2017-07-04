import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Integer integer = new Integer(54);
    // Double dbl = new Double(54.45);
    // the class version of int, this allows you to include this in an ArrayList

    ArrayList<Integer> intArrayList = new ArrayList<Integer>();

    for (int i=0; i<=10; i++) {
      intArrayList.add(Integer.valueOf(i));
    }

    for (int i=0; i<=10; i++) {
      System.out.println(i + " => " + intArrayList.get(i).intValue());
    }

    Integer intValue = 56; // Integer.valueOf(56) is the longer version

    ArrayList<Double> d = new ArrayList<Double>();
    for(double i=0; i<=10; i += .5) {
      // d.add(Double.valueOf(i));
      d.add(i);
    }

    for (int i=0; i<d.size(); i++) {
      double value = d.get(i);
      System.out.println(i + " => " + value);
    }
  }
}