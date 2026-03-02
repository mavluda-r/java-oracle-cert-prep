package org.example.Lesson30_p2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {

  String model;
  String color;
  double engine;

  Car(String model, String color, double engine) {
    this.model = model;
    this.color = color;
    this.engine = engine;
  }

  public String toString() {
    return "Our car is " + model + ", color is " + color + ", and engine " + engine;
  }
}

class Test10 {

  public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
    ArrayList<Car> cars = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      cars.add(carSupplier.get());
    }
    return cars;
  }

  public static void changeCar(Car car, Consumer<Car> consumer) {
    consumer.accept(car);
  }


  public static void main(String[] args) {
    ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tilda", "silver metalic", 1.6));
    System.out.println("our cars: " + ourCars);

    changeCar(ourCars.get(0), car -> {
      car.color = "red";
      car.engine = 2.4;
      System.out.println("updated car: " + car);
    });
    Consumer<Car> changeCar = car -> {
      car.color = "green";
      car.engine = 2.4;
      System.out.println("updated car: " + car);
    };
    System.out.println("our cars: " + ourCars);
  }
}