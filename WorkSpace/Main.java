package WorkSpace;
//Przygotuj program w którym zasymulujesz sytuację w której kierowca samochodu
// łapie gumę w kole i zabiera go do warsztatu do naprawy.
//
//        w main przygotuj 4 obiekty kół, każde z nich ma mieć ustawione ciśnienie i
//        ma nie być przebite
//        zbierz wszystkie koła do zbioru i przekaż do obiektu typu Samochod
//        zasymuluj zdarzenie, że samochód łapie gumę w losowym kole
//        obiekt typu Warsztat może przyjmować samochód do naprawy
//        naprawa polega na tym, że warsztat wyszukuje które koło z samochodu
//        jest zepsute i poprawia jego stan
//        na koniec naprawy warsztat zwraca obiekt typu Paragon zawierający
//        odzaj usługi, ile razy była wykonana oraz łączną cenę

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Wheel> wheels = new ArrayList<>();

        Wheel wheel1 = new Wheel( WheelType.FRONT_LEFT);
        Wheel wheel2 = new Wheel( WheelType.FRONT_RIGHT);
        Wheel wheel3 = new Wheel( WheelType.REAR_LEFT);
        Wheel wheel4 = new Wheel( WheelType.REAR_RIGHT);
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);
        Car car1 = new Car(wheels);
        System.out.println(car1);
        car1.flatTire();
        System.out.println(car1);
        CarMechanic carMechanic = new CarMechanic(car1);
        carMechanic.repairWheel();
        System.out.println("*****");
        System.out.println(car1);


    }
}
