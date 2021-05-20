package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class HelloServiceAspects {
//
//    @Before("execution(* services.HelloWorld.sayHello(..))")
//    public void before()  {
//        System.out.println("A");
//    }
//
//    @After("execution(* services.HelloWorld.sayHello(..))")
//    public void After()  {
//        System.out.println("B");
//    }
//    @AfterReturning("execution(* services.HelloWorld.sayHello(..))")
//    public void afterReturning()  {
//        System.out.println("C");
//    }
//    @AfterThrowing("execution(* services.HelloWorld.sayHello(..))")
//    public void afterThrowing()  {
//        System.out.println("D");
//    }

    @Around( "execution(* services.HelloWorld.sayHello(..))" )
    public Object around(ProceedingJoinPoint joinPoint) {
        Object result =null;
        System.out.println("print before execution");
        try {
            result = joinPoint.proceed();
            System.out.println(result);
            System.out.println("print after execution");

        }catch(Throwable e)
        {
            e.printStackTrace();
        }
    return result;
     }

}
