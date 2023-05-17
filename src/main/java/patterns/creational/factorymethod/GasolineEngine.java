package patterns.creational.factorymethod;

public class GasolineEngine implements Engine {
    @Override
    public String getEngineType() {
        return "가솔린 엔진";
    }
}