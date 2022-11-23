package org.springframework.boot.autoconfigure.study.spring;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

import java.util.Map;

/**
 * @author ThreePure
 * @createDate 2022/11/23
 * @description  实现spring 的Condition接口，并且重写matches()方法，如果@ConditionalOnLinux的注解属性environment是linux就返回true
 */
public class LinuxCondition implements Condition {

	/**
	 * Determine if the condition matches.
	 *
	 * @param context  the condition context   获取一些环境信息
	 * @param metadata the metadata of the {@link AnnotationMetadata class}
	 *                 or {@link MethodMetadata method} being checked     获取一些注解元数据
	 * @return {@code true} if the condition matches and the component can be registered,
	 * or {@code false} to veto the annotated component's registration
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 获得注解@ConditionalOnLinux的所有属性
		Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalOnLinux.class.getName());
		assert annotationAttributes != null;
		// 获得注解@ConditionalOnLinux的environment属性
		String environment1 = (String) annotationAttributes.get("environment");
		// 若environment等于linux，则返回true
		return "linux".equals(environment1);
	}
}
