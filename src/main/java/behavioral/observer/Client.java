package behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        Subscriber aleh = new Subscriber("Aleh");
        Subscriber valera = new Subscriber("Valera");

        newspaper.addObserver(aleh);
        newspaper.addObserver(valera);

        newspaper.releaseNewNewspaper();
    }
}
