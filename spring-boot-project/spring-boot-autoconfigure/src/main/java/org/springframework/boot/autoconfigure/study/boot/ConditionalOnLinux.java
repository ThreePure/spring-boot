package org.springframework.boot.autoconfigure.study.boot;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author ThreePure
 * @createDate 2022/11/23
 * @description 自定义条件注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnLinuxCondition.class)
public @interface ConditionalOnLinux {
	String key();
	String value();
}
