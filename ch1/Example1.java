package ch1;
public class Example1 {
  public static void main(String[] args) {
    Car.movingForward();
    Car car = new Car() {
    };
    car.braking();
    Car.main(args);
  }

}

interface Car {

  public static void main(String[] args) {
    System.out.println("interface");
    movingForward();
  }
  default void braking() {
    movingForward();
  }
  static void movingForward() {
    System.out.println("brrr, brrr");
  }
}