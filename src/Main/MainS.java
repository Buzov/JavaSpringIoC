/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author artur
 */
public class MainS {
    public static void main(String[] args) {
        ApplicationContext actx= new ClassPathXmlApplicationContext("bean.xml");
        IPrintf ptr = (IPrintf) actx.getBean("print1");//new Printer("Hello word!!!!");
        ptr.printf();
        ptr.printList();
        ptr.printList();
        
        Single single = (Single) actx.getBean("proxy");
        single.print();
        Single singleNew = (Single) actx.getBean("sigle");
        singleNew.print();
        
        InitClass initClass = (InitClass) actx.getBean("initClass");
        System.out.println(initClass);
        
        InnerClass innerClass = (InnerClass) actx.getBean("idInnerClass1");//new InnerClass("Inner Class Hello!!!");
        
        System.out.println(innerClass);
        
        CloseClass closeClass = /*(CloseClass) actx.getBean("close_class");*/FactoryClass.getInstance();
    }
}

