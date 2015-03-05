package Main;

public class Single {

    private static Single single;

    private Single() {

    }

    public static Single getInstance() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }
    
    public void print(){
        System.out.println("Hi, Single!!!");
    }

}
