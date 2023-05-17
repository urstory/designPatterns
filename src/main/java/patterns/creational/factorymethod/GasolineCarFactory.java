package patterns.creational.factorymethod;

public class GasolineCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        Engine engine = new GasolineEngine();
        Wheel wheel = new RegularWheel();
        return new GasolineCar(engine, wheel);
    }
}

