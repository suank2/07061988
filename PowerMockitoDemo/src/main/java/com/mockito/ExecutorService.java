package com.mockito;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecutorService {
	
	public void executeTask() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		System.out.println("executeTask");
		ExecutorInvoker  executorInvoker = new ExecutorInvoker();
		
		Method method = ExecutorInvoker.class.getMethod("getServiceData");
		System.out.println();
		method.invoke(executorInvoker);
		System.out.println("executeTask");
	}
}
