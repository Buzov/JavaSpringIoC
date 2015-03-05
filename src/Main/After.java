package Main;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class After implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        System.out.println("После метода!!!!");
    }
    
}
