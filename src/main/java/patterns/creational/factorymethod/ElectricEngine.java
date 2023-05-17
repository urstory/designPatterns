package patterns.creational.factorymethod;

public class ElectricEngine implements Engine {
    @Override
    public String getEngineType() {
        return "전기 엔진";
    }
}