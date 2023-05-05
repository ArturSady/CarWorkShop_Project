package WorkSpace;

import java.util.List;
import java.util.Random;

public class Car {
  List<Wheel> wheels;
 private String brand = "VW";

    public Car(List<Wheel> wheels) {
        this.wheels = wheels;
    }
    public void flatTire(){
        Random random = new Random();
        wheels.get(random.nextInt(wheels.size())).accident();
    }


    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", brand='" + brand + '\'' +
                '}';
    }
}
