package com.infosky.yjj.utils;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.util.Assert;

public class ApplicationContextUtils {
	public static <T> T getBean(BeanFactory factory, String name, Class<T> clazz) {
		Assert.notNull(factory, "BeanFactory must not be null");
		if (factory.containsBean(name)) {
			return factory.getBean(name, clazz);
		}
		return null;
	}
}
