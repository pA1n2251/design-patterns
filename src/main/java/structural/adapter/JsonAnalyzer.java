package structural.adapter;

public class JsonAnalyzer {

    public void analyzeJsonData(JsonData jsonData) {
        if (jsonData.getJsonData() == null) {
            System.out.println("Wrong data format");
        } else {
            System.out.println("Json Data analyzed: " + jsonData.getJsonData());
        }
    }
}
