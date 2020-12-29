package com.xu;

import com.xu.annotation.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @author: ll.xu
 * @date: 2020/12/22
 **/
@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class DemoConfig {
	@Bean
	public Teacher getTeacher(){
		return new Teacher();
	}
}
