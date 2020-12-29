package com.xu;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;

/**
 * @description: TODO 类描述
 * @author: ll.xu
 * @date: 2020/12/9
 **/
public class Teacher implements BeanNameAware {

	private static ApplicationContext applicationContext;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		//applicationContext.
	}


}
