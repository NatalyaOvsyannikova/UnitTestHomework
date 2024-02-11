package com.rntgroup.tat.unittest.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import java.time.LocalDateTime;

public class MyTestListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult){
        System.out.println("method started: "+ method.getTestMethod().getMethodName() + " at " + LocalDateTime.now());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("method finished [" + testResult.isSuccess() + "]: " + method.getTestMethod().getMethodName() + "\n");
    }

}
