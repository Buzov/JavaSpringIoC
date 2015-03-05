package Main;

import java.util.List;

public class Printer implements IPrintf{

    private String s = null;
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private InnerClass innerClass = null;
    private List<String> list;
    private List<InnerClass> listInnerClass;
    
    public Printer(String s){
        this.s = s;
    }
    
    public Printer(String s, int a){
        this.s = s;
        this.a = a;
    }
    
    public Printer(String s, int a, int b){
        this.s = s;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void printf() {
        System.out.println(s + " a = " + a + " b = " + b + " c = " + c + innerClass);
    }
    
    public void printList() {
        for(String string : list) {
            System.out.println(string);
        }
    }
    
    public void printListInnerClass() {
        for(InnerClass inClass : listInnerClass) {
            System.out.println(inClass.toString());
        }
    }
    
    public int getC(){
        return c;
    }
    
    public void setC(int c) {
        this.c = c;
    }
    
    public InnerClass getInnerClass(){
        return innerClass;
    }
    
    public void setC(InnerClass innerClass) {
        this.innerClass = innerClass;
    }
    
    public List<String> getList(){
        return list;
    }
    
    public void setList(List<String> list) {
        this.list = list;
    }
    
    public List<InnerClass> getListInnerClass(){
        return listInnerClass;
    }
    
    public void setListInnerClass(List<InnerClass> listInnerClass) {
        this.listInnerClass = listInnerClass;
    }
    
}
