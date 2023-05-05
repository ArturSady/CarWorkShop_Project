package WorkSpace;

public class Wheel {
     boolean wheelPunctured = false;
     double wheelPressure = 2.4;
    private WheelType wheelType;

    public Wheel(WheelType wheelType) {
        this.wheelType = wheelType;
    }
    public void accident(){
        wheelPressure = 0;
        wheelPunctured = true;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelPunctured=" + wheelPunctured +
                ", wheelPressure=" + wheelPressure +
                ", wheelType=" + wheelType +
                '}';
    }
}
