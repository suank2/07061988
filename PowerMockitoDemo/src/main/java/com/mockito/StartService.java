package com.mockito;

import java.lang.reflect.InvocationTargetException;

public class StartService {
	public static void main(String[] args) {
		ExecutorService executorService = new ExecutorService();
		try {
			executorService.executeTask();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
