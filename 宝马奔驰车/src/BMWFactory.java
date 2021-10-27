public class BMWFactory implements Factory{
    @Override
    public Car getCar() {
        return new BMWCAR();

    }
}
