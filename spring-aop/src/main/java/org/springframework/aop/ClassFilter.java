/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop;

/**
 * Filter that restricts matching of a pointcut or introduction to
 * a given set of target classes.
 * 限制切入点或引入到给定目标类集的匹配的过滤器。
 *
 * <p>Can be used as part of a {@link Pointcut} or for the entire
 * targeting of an {@link IntroductionAdvisor}.
 * <p>可用作 {@link Pointcut} 的一部分或用于 {@link IntroductionAdvisor} 的整个定位。
 *
 * @author Rod Johnson
 * @see Pointcut
 * @see MethodMatcher
 */
@FunctionalInterface
public interface ClassFilter {

	/**
	 * Should the pointcut apply to the given interface or target class?
	 * 切入点应该应用于给定的接口还是目标类？
	 * @param clazz the candidate target class
	 * @return whether the advice should apply to the given target class
	 */
	boolean matches(Class<?> clazz);


	/**
	 * Canonical instance of a ClassFilter that matches all classes.
	 * 匹配所有类的 ClassFilter 的规范实例。
	 */
	ClassFilter TRUE = TrueClassFilter.INSTANCE;

}
