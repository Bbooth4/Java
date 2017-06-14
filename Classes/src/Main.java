public class Main {
  public static void main(String[] args) {
    Car porsche = new Car();
    Car tesla = new Car();

    // porsche.model = "Carrera"; 
    // the above is the wrong way to do it as it needs to be public then and violate the encapsulation principal
    // by not allowing people to access the field directly, they are unable to make invalid data
    porsche.setModel("Carrera");

    System.out.println(porsche.getModel());

  }
}