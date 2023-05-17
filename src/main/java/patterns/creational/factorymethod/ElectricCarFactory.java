package patterns.creational.factorymethod;

public class ElectricCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        Engine engine = new ElectricEngine();
        Wheel wheel = new WinterWheel();
        return new ElectricCar(engine, wheel);
    }
}