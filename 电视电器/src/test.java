public class test {
    public static void main(String[] args) throws Exception {

        String brandName = XMLUtilTV.getBrandName();
        TV tv = TVFactory.produceTV(brandName);
        tv.display();
    }
}
