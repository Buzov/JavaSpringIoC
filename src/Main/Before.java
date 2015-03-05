package Main;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class Before implements MethodBeforeAdvice {

    //выполняется до метода
    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("До метода!!!");
    }

}
