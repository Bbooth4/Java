public class Main {
  public static void main(String[] args) {
    int value = 1;
    
    switch (value) {
      case 1:
        System.out.println("1");
        break;

      case 2: 
        System.out.println("2");
        break;
    
      case 3: case 4: case 5:
        System.out.println("Was 3, 4 or 5");

      default:
        System.out.println("Not 1, 2, 3, 4 or 5");
        break;
    }
  }
}