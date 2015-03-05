package Main;

public class InitClass {
    
    private String s;
    
    public InitClass() {
        
    }
    
    public void init() {
        System.out.println("Init nethod");
        s = "Class init";
    }
    
    @Override
    public String toString() {
        return s;
    }
    
    public void destroy() {
        System.out.println("Destroy method");
    }
}
