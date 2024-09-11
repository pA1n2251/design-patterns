package structural.proxy;

public class Client {

    public static void main(String[] args) {
        DB db = new LoggingProxy(new RealDB());
        db.save("Sample data");
    }
}
