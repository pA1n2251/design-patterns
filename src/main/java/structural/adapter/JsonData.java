package structural.adapter;

public class JsonData {
    private String jsonData;

    public JsonData(String jsonData) {
        if (jsonData.contains("JSON")) {
            this.jsonData = jsonData;
        }
    }

    public String getJsonData() {
        return jsonData;
    }
}
