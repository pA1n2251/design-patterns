package structural.adapter;

public class Adapter implements XMLAnalyzer {

    private final JsonAnalyzer jsonAnalyzer;

    public Adapter(JsonAnalyzer jsonAnalyzer) {
        this.jsonAnalyzer = jsonAnalyzer;
    }

    @Override
    public void analyzeXMLData(XMLData xmlData) {
        String json = xmlData.getXmlData().replace("XML", "JSON");
        JsonData jsonData = new JsonData(json);
        jsonAnalyzer.analyzeJsonData(jsonData);
    }
}
