package org.springframework.boot.autoconfigure.study.spring;

import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

/**
 * @author ThreePure
 * @createDate 2022/11/23
 * @description 自定义Environment子类
 */
public class LinuxEnvironment implements Environment {
	/**
	 * Return the set of profiles explicitly made active for this environment. Profiles
	 * are used for creating logical groupings of bean definitions to be registered
	 * conditionally, for example based on deployment environment. Profiles can be
	 * activated by setting {@linkplain AbstractEnvironment#ACTIVE_PROFILES_PROPERTY_NAME
	 * "spring.profiles.active"} as a system property or by calling
	 * {@link ConfigurableEnvironment#setActiveProfiles(String...)}.
	 * <p>If no profiles have explicitly been specified as active, then any
	 * {@linkplain #getDefaultProfiles() default profiles} will automatically be activated.
	 *
	 * @see #getDefaultProfiles
	 * @see ConfigurableEnvironment#setActiveProfiles
	 * @see AbstractEnvironment#ACTIVE_PROFILES_PROPERTY_NAME
	 */
	@Override
	public String[] getActiveProfiles() {
		return new String[0];
	}

	/**
	 * Return the set of profiles to be active by default when no active profiles have
	 * been set explicitly.
	 *
	 * @see #getActiveProfiles
	 * @see ConfigurableEnvironment#setDefaultProfiles
	 * @see AbstractEnvironment#DEFAULT_PROFILES_PROPERTY_NAME
	 */
	@Override
	public String[] getDefaultProfiles() {
		return new String[0];
	}

	/**
	 * Return whether one or more of the given profiles is active or, in the case of no
	 * explicit active profiles, whether one or more of the given profiles is included in
	 * the set of default profiles. If a profile begins with '!' the logic is inverted,
	 * i.e. the method will return {@code true} if the given profile is <em>not</em> active.
	 * For example, {@code env.acceptsProfiles("p1", "!p2")} will return {@code true} if
	 * profile 'p1' is active or 'p2' is not active.
	 *
	 * @param profiles
	 * @throws IllegalArgumentException if called with zero arguments
	 *                                  or if any profile is {@code null}, empty, or whitespace only
	 * @see #getActiveProfiles
	 * @see #getDefaultProfiles
	 * @see #acceptsProfiles(Profiles)
	 * @deprecated as of 5.1 in favor of {@link #acceptsProfiles(Profiles)}
	 */
	@Override
	public boolean acceptsProfiles(String... profiles) {
		return false;
	}

	/**
	 * Return whether the {@linkplain #getActiveProfiles() active profiles}
	 * match the given {@link Profiles} predicate.
	 *
	 * @param profiles
	 */
	@Override
	public boolean acceptsProfiles(Profiles profiles) {
		return false;
	}

	/**
	 * Return whether the given property key is available for resolution,
	 * i.e. if the value for the given key is not {@code null}.
	 *
	 * @param key
	 */
	@Override
	public boolean containsProperty(String key) {
		return false;
	}

	/**
	 * Return the property value associated with the given key,
	 * or {@code null} if the key cannot be resolved.
	 *
	 * @param key the property name to resolve
	 * @see #getProperty(String, String)
	 * @see #getProperty(String, Class)
	 * @see #getRequiredProperty(String)
	 */
	@Override
	public String getProperty(String key) {
		return null;
	}

	/**
	 * Return the property value associated with the given key, or
	 * {@code defaultValue} if the key cannot be resolved.
	 *
	 * @param key          the property name to resolve
	 * @param defaultValue the default value to return if no value is found
	 * @see #getRequiredProperty(String)
	 * @see #getProperty(String, Class)
	 */
	@Override
	public String getProperty(String key, String defaultValue) {
		return null;
	}

	/**
	 * Return the property value associated with the given key,
	 * or {@code null} if the key cannot be resolved.
	 *
	 * @param key        the property name to resolve
	 * @param targetType the expected type of the property value
	 * @see #getRequiredProperty(String, Class)
	 */
	@Override
	public <T> T getProperty(String key, Class<T> targetType) {
		return null;
	}

	/**
	 * Return the property value associated with the given key,
	 * or {@code defaultValue} if the key cannot be resolved.
	 *
	 * @param key          the property name to resolve
	 * @param targetType   the expected type of the property value
	 * @param defaultValue the default value to return if no value is found
	 * @see #getRequiredProperty(String, Class)
	 */
	@Override
	public <T> T getProperty(String key, Class<T> targetType, T defaultValue) {
		return null;
	}

	/**
	 * Return the property value associated with the given key (never {@code null}).
	 *
	 * @param key
	 * @throws IllegalStateException if the key cannot be resolved
	 * @see #getRequiredProperty(String, Class)
	 */
	@Override
	public String getRequiredProperty(String key) throws IllegalStateException {
		return null;
	}

	/**
	 * Return the property value associated with the given key, converted to the given
	 * targetType (never {@code null}).
	 *
	 * @param key
	 * @param targetType
	 * @throws IllegalStateException if the given key cannot be resolved
	 */
	@Override
	public <T> T getRequiredProperty(String key, Class<T> targetType) throws IllegalStateException {
		return null;
	}

	/**
	 * Resolve ${...} placeholders in the given text, replacing them with corresponding
	 * property values as resolved by {@link #getProperty}. Unresolvable placeholders with
	 * no default value are ignored and passed through unchanged.
	 *
	 * @param text the String to resolve
	 * @return the resolved String (never {@code null})
	 * @throws IllegalArgumentException if given text is {@code null}
	 * @see #resolveRequiredPlaceholders
	 */
	@Override
	public String resolvePlaceholders(String text) {
		return null;
	}

	/**
	 * Resolve ${...} placeholders in the given text, replacing them with corresponding
	 * property values as resolved by {@link #getProperty}. Unresolvable placeholders with
	 * no default value will cause an IllegalArgumentException to be thrown.
	 *
	 * @param text
	 * @return the resolved String (never {@code null})
	 * @throws IllegalArgumentException if given text is {@code null}
	 *                                  or if any placeholders are unresolvable
	 */
	@Override
	public String resolveRequiredPlaceholders(String text) throws IllegalArgumentException {
		return null;
	}
}
