public class TVFactory {
    public static TV produceTV(String brand) throws Exception {
        if (brand.equalsIgnoreCase("TCL")) {
            System.out.println("电视机工厂生产TCL电视机！");
            return new TCLTV();
        } else if (brand.equalsIgnoreCase("Hisense")) {
            System.out.println("电视机工厂生产海信电视机！");
            return new HisenseTV();
        } else {
            throw new Exception("对不起，暂不能生产该品牌电视机！");
        }
    }
}

