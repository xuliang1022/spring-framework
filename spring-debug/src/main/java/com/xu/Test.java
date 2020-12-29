package com.xu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: TODO 类描述
 * @author: ll.xu
 * @date: 2020/12/9
 **/
public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);

		ac.close();
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (int i = 0; i < beanDefinitionNames.length; i++) {
			System.out.println(beanDefinitionNames[i]);
		}
	}
}
