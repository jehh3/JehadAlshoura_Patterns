package Adapter;

public class Main {

    public static void main(String[] args) {
        
        LegacyLogger Legacy = new LegacyLogger();

        Logger logger = new LegacyLoggeradapter(Legacy);

        Application app = new Application(logger);
        
        app.run();
    }
}