package org.springframework.boot.autoconfigure.study.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author ThreePure
 * @createDate 2022/11/23
 * @description 自定义配置类
 */
@Configuration
public class ConditionConfig {

	// 只有`@ConditionalOnLinux`的注解属性`environment`是"linux"时才会创建bean
	@Bean
	@ConditionalOnLinux(environment = "linux")
	public Environment linuxEnvironment(){
		return new LinuxEnvironment();
	}

}
