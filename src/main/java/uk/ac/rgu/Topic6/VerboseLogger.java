package uk.ac.rgu.Topic6;

public class VerboseLogger implements Logger {
    
    private static VerboseLogger instance = null;

    private int numTimesUsed = 0;

    public static VerboseLogger getInstance(){

        if(instance == null){
            instance = new VerboseLogger();
        }

        return instance;

    }

    private VerboseLogger(){


    }

    public void log(String msg){
        this.numTimesUsed++;
        System.out.println("VerboseLogger: " + msg);
        System.out.println(this.numTimesUsed);

    }
}
