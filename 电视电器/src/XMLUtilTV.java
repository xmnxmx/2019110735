public class XMLUtilTV {
    public static String getBrandName() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("res/SimpleFactoryTVNameConfig.xml"));
            NodeList node = doc.getElementsByTagName("brandName");
            Node firstChild = node.item(0).getFirstChild();
            String brandName = firstChild.getNodeValue().trim();
            return brandName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}