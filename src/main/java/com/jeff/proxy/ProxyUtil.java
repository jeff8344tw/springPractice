package com.jeff.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {

    private MathImpl mathImpl;

    public ProxyUtil(MathImpl mathImpl) {
        this.mathImpl = mathImpl;
    }

    public Object getProxy(){
        // 獲取當前類的類加載器，用來加載代理對象所屬類
        ClassLoader loader = this.getClass().getClassLoader();
        // 獲取目標對象實現的所有接口的Class，代理類會和目標類實現相同的接口，最終通過代理對象實現功能
        Class[] interfaces = mathImpl.getClass().getInterfaces();

        return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            // 代理對象實現功能的方式
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try{
                    MyLogger.before(method.getName(), Arrays.toString(args));
                    // 動態代理對象實現功能
                    Object result = method.invoke(mathImpl, args);
                    MyLogger.after(method.getName(), result);
                    return result;
                }catch (Exception ex){
                    ex.printStackTrace();
                    MyLogger.throwing();
                }finally {
                    System.out.println("finally");
                }
                return null;
            }
        });
    }
}
