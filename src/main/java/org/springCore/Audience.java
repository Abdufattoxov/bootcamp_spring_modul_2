package org.springCore;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
    @Before("execution(* org.springCore.Performance.perform())")
    public void takeSeat(){
        System.out.println("Take your seat");
    }
    @Before("execution(* org.springCore.Performance.perform())")
    public void silencePhone(){
        System.out.println("Silence phones");
    }
    @AfterReturning("execution(* org.springCore.Performance.perform())")
    public void applauses(){
        System.out.println("Clap Clap Clap ....");
    }
    @AfterThrowing("execution(* org.springCore.Performance.perform())")
    public void refund(){
        System.out.println("Refunding ....");
    }
}
