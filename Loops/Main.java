public class Main {
  public static void main(String[] args) {

    for(int i = 2; i <= 10; i++) {
      System.out.println("Interest Rate at " + calculateInterest(10000.0, i));
    }

    int counter = 0;

    for (int i = 20; i <= 100; i++) {
      if (isPrime(i)) {
        counter++;
        System.out.println("For, if " + i);
      }
      if (counter == 3) {
        break; 
      }
    }

    int count = 0;

    while (count != 6) {
      count++;
      System.out.println("Count is at " + count);
    }

    int c = 0;

    do {
      c++;
      System.out.println("C is at " + c);
    } while(c != 6);

    int current = 5;
    int end = 20;
    int totalEvenNumbers = 0;

    while (current <= end) {
      if (!isEvenNumber(current)) {
        current++;
        continue;
      }
      System.out.println("Even number " + current);
      totalEvenNumbers++;
      current++;
      if (totalEvenNumbers == 5) {
        System.out.println("Total Even Numbers = " + totalEvenNumbers);
        break;
      }
    }

  }

  // String.format() converts a number down to 2 decimals

  public static double calculateInterest(double amount, double interestRate) {
    return amount *(interestRate/100);
  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }

    for(int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false; 
      }
    }
    return true;
  }

  public static boolean isEvenNumber(int number) {
    if (number % 2 == 0) {
      return true;
    }
    return false; 
  }

}