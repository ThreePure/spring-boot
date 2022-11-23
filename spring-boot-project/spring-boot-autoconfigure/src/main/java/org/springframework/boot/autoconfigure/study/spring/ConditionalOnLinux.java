package org.springframework.boot.autoconfigure.study.spring;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author ThreePure
 * @createDate 2022/11/23
 * @description 自定义条件注解
 */
@Target({
		ElementType.TYPE,
		ElementType.METHOD
})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(LinuxCondition.class)
public @interface ConditionalOnLinux {

	// 标注是哪个环境
	String environment() default "";

}
