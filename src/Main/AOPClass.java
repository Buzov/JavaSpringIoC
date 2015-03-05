package Main;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AOPClass implements MethodBeforeAdvice, AfterReturningAdvice{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("До метода!!!");
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        System.out.println("После метода!!!");
    }
    
}
