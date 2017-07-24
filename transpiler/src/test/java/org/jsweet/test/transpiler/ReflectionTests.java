/* 
 * JSweet - http://www.jsweet.org
 * Copyright (C) 2015 CINCHEO SAS <renaud.pawlak@cincheo.fr>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jsweet.test.transpiler;

import org.junit.Test;

import source.reflection.ArrayMethods;
import source.reflection.BasicBeanReflection;
import source.reflection.FieldAccess;

public class ReflectionTests extends AbstractTest {

	@Test
	public void testBasicBeanReflection() {
		eval((h, r) -> {
			h.assertNoProblems();
		}, getSourceFile(BasicBeanReflection.class));
	}

	@Test
	public void testFieldAccess() {
		eval((h, r) -> {
			h.assertNoProblems();
		}, getSourceFile(FieldAccess.class));
	}
	
	@Test
	public void testArrayMethods() {
		eval((h, r) -> {
			h.assertNoProblems();
		}, getSourceFile(ArrayMethods.class));
	}
	
}