package com.jeff.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyLoggerAspect {

    // 定義切入點表達式
    @Pointcut(value="execution(* com.jeff.spring.aop.*.*(..))")
    public void test() {

    }

    /**
     * @Before:將方法指定為前置通知 必須設置value, 其值為切入點表達式
     * 前置通知:作用於方法執行之前
     * "execution...":切入點表達式
     * JoinPoint:連接點
     */
//    @Before(value = "execution(public int com.jeff.spring.aop.MathImpl.add(int, int))")
    @Before(value = "test()")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName(); // 獲取方法名
        System.out.println("before method:" + methodName + ",arguments:" + Arrays.toString(args));
    }

    /**
     * @After:將方法標註為後置通知
     * 後置通知:作用於方法的finally語句塊，即不管有沒有異常都會執行
     */
    @After(value="execution(* com.jeff.spring.aop.*.*(..))")
    public void afterMethod() {
        System.out.println("after method");
    }

    /**
     * @AfterReturning:將方法標註為返回通知
     * 返回通知: 作用於方法執行之後
     * 可通過returning設置接收方法返回值的變量名
     * 要想在方法中使用，必須在方法的中形參中設置和變量名相同參數名的參數
     */
    @AfterReturning(value="execution(* com.jeff.spring.aop.*.*(..))", returning="result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("method:"+methodName+",result:"+result);
    }

    /**
     * @AfterThrowing:將法法標註為異常通知(例外通知)
     * 異常通知(例外通知):作用於方法拋出異常時
     * 可通過throwing設置接收方法返回的異常訊息
     * 在參數列表中可通過具體的異常類型，來對指定的異常訊息進行操作
     */
    @AfterThrowing(value="execution(* com.jeff.spring.aop.*.*(..))", throwing="ex")
    public void afterThrowing(Exception ex){
        System.out.println("has Exception:"+ex);
    }

    @Around(value="execution(* com.jeff.spring.aop.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){

        Object result = null;

        // 執行方法
        try {
            System.out.println("前置通知");
            result = joinPoint.proceed();
            System.out.println("返回通知");
            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("異常通知");
        } finally {
            System.out.println("後置通知");
        }
        return -1;
    }
}
