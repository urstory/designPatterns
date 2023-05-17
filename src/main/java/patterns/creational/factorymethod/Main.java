package patterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        CarFactory gasolineCarFactory = new GasolineCarFactory();
        Car gasolineCar = gasolineCarFactory.createCar();
        gasolineCar.startEngine();

        CarFactory electricCarFactory = new ElectricCarFactory();
        Car electricCar = electricCarFactory.createCar();
        electricCar.startEngine();
    }
}