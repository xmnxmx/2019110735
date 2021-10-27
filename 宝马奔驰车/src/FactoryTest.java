public class FactoryTest {
    public static void main(String[] args){
        Factory bmwFactory = new BMWFactory();

        System.out.println(bmwFactory.getCar().getName());

        Factory benzFactory = new BenzFactory();
        
        System.out.println(benzFactory.getCar().getName());
    }
}
