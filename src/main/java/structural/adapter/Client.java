package structural.adapter;

public class Client {

    public static void main(String[] args) {
        XMLData xmlData = new XMLData("XML string");

        // Не работает, потому что не подходит XML дата к JSON дате
        JsonAnalyzer jsonAnalyzer = new JsonAnalyzer();
        jsonAnalyzer.analyzeJsonData(new JsonData(xmlData.getXmlData()));

        // Работает с адаптером
        XMLAnalyzer xmlAnalyzer = new Adapter(jsonAnalyzer);
        xmlAnalyzer.analyzeXMLData(xmlData);
    }
}
