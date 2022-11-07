package uk.ac.rgu.Topic6;

public class ForwardPrintStrategy implements PrintStrategy {

    @Override
    public void print(String[] values) {
        
        for(String value : values){
            System.out.println(value);
        }

        // TODO Auto-generated method stub
        
    }

    
}
