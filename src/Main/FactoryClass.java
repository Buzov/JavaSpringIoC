package Main;

public class FactoryClass {
    
    private static CloseClass closeClass;
    
    public static CloseClass getInstance() {
        if(closeClass == null){
            closeClass = new CloseClass();
        }
        return closeClass;
    }
}
