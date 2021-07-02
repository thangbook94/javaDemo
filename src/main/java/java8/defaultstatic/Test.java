package java8.defaultstatic;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW", 10);
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        System.out.println(car.getSpeed());
        System.out.println(car.getSpeedInKMH(car.getSpeed()));
        System.out.println(Vehicle.getHorsePower(1000, 100));
    }
}
