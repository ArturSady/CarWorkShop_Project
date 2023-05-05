package WorkSpace;

public class CarMechanic {
    private Car car;

    public CarMechanic(Car car) {
        this.car = car;
    }
    public void repairWheel(){
        for (Wheel wheel: car.wheels) {
           if(wheel.wheelPunctured == true){
               wheel.wheelPunctured = false;
               wheel.wheelPressure = 2.4;
               billForRepair();
           }
        }
    }
    public void billForRepair(){
        System.out.println("""
                Naprawiono koło.
                Łączny koszt naprawy 40 PLN brutto.
                Polecamy się na przyszłość, Arczi-Mechanic""");
    }
}
