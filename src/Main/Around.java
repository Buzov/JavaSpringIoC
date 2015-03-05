package Main;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;



public class Around implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] os, MethodProxy mp) throws Throwable {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
