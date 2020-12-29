package com.xu;

/**
 * @description: TODO 类描述
 * @author: ll.xu
 * @date: 2020/12/9
 **/
@FunctionalInterface
public interface XuBeanFactoryPostProcessor<R,T>  {
	    R print(T name);
}
