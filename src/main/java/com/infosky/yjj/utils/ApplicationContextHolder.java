package com.infosky.yjj.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 通过实现 ApplicationContextAware 来获取 上下文
 * 返回ApplicationContext 来获取 XML 定义的Bean实例
 **/

public final class ApplicationContextHolder implements ApplicationContextAware {

	public ApplicationContextHolder() {

	}

	private static ApplicationContext APPLICATION_CONTEXT;

	public synchronized void setApplicationContext(
			ApplicationContext applicationContext) throws BeansException {
		if (APPLICATION_CONTEXT != null) {
			try {
				throw new Exception("Application Context has been setted.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		APPLICATION_CONTEXT = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return APPLICATION_CONTEXT;
	}
}
