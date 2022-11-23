package org.springframework.boot.autoconfigure.study.boot;

import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author ThreePure
 * @createDate 2022/11/23
 * @description springboot之使用SpringBootCondition进行扩展,继承SpringBootCondition抽象类，重写getMatchOutcome方法
 */
public class OnLinuxCondition extends SpringBootCondition {

	@Override
	public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {

		Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalOnLinux.class.getName(), true);
		Object key = annotationAttributes.get("key");
		Object value = annotationAttributes.get("value");
		if (key == null || value == null){
			return new ConditionOutcome(false, "False");
		}
		//String property = context.getEnvironment().getProperty(key.toString());
		//if (value.equals(property)){
		if ("ThreePure".equals(value)){
			return new ConditionOutcome(true, "True");
		}
		return new ConditionOutcome(false, "Flase");
	}
}
