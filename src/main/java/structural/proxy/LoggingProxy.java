package structural.proxy;

public class LoggingProxy implements DB {

    private RealDB realDB;

    public LoggingProxy(RealDB realDB) {
        this.realDB = realDB;
    }

    @Override
    public void save(String data) {
        System.out.println("Logging request to DB");
        realDB.save(data);
    }
}
