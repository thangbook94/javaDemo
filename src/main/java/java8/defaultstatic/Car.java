package java8.defaultstatic;

public class Car implements Vehicle {

    private String brand;
    private double speed;

    public Car(String brand,double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}