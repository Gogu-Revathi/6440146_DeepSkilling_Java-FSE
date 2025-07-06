package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().toShortString();
        System.out.println("[LOG] Starting method: " + methodName);

        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // Call the original method
        long end = System.currentTimeMillis();

        System.out.println("[LOG] Finished method: " + methodName + " in " + (end - start) + " ms");
        return result;
    }
}
