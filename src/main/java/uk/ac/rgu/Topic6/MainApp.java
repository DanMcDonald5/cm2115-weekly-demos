package uk.ac.rgu.Topic6;
import uk.ac.rgu.Topic6.*;

public class MainApp {
    

   /*  private Logger logger;
    public void setLogger(Logger logger){
        this.logger = logger;
    }*/
    private String[] words = {"Computing", "Aberdeen", "Amphibian", "Mouse"};
    public void doSomething(){
        
        System.out.println("I'm doing something.");
    }

    public static void main(String[] args){
        MainApp instance = new MainApp();
        ForwardPrintStrategy s = new ForwardPrintStrategy();
        instance.printWords(s);
        System.out.println("");

        PrintStrategy s2 = (values) -> {
            for(int i = values.length - 1; i >= 0; i--){
                System.out.println(values[i]);
            }
        };

        instance.printWords(s2);
        
       
    }

    public void printWords(PrintStrategy printStrategy){
        printStrategy.print(this.words);

    }
}
