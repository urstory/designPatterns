package patterns.creational.factorymethod;

public class GasolineCar implements Car {
    private Engine engine;
    private Wheel wheel;

    public GasolineCar(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public void startEngine() {
        System.out.println(engine.getEngineType() + "과 " + wheel.getWheelType()
                + "로 구동되는 자동차가 시동을 걸었습니다.");
    }
}