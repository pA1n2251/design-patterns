package structural.proxy;

public class RealDB implements DB {
    @Override
    public void save(String data) {
        System.out.println("Saving data to DB: " + data);
        System.out.println("Data saved!");
    }
}
