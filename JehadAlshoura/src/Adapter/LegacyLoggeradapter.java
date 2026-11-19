package Adapter;

public class LegacyLoggeradapter implements Logger{

    private final LegacyLogger Legacy;

    public LegacyLoggeradapter(LegacyLogger Legacy){
        this.Legacy = Legacy;
    }

    @Override
    public void info(String message){
        Legacy.log("INFO", message);
    }

    @Override
    public void error(String message){
        Legacy.log("ERROR", message);
    }
}