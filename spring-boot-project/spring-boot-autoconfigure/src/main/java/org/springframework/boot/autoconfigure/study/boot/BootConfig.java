package org.springframework.boot.autoconfigure.study.boot;

import org.springframework.boot.autoconfigure.study.spring.LinuxEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ThreePure
 * @createDate 2022/11/23
 * @description 配置文件
 */
@Configuration
public class BootConfig {


	@ConditionalOnLinux(key = "com.th.example", value = "ThreePure")
	@Bean
	public LinuxEnvironment linuxEnvironment(){
		return new LinuxEnvironment();
	}

}
