/*
 * Copyright 2013-2019 the original author or authors.
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

package org.springframework.cloud.internal;

import java.io.File;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class MainTests {

	@Test
	void should_do_nothing_when_parent_dir_is_not_found() {
		File nonExistantFile = new File("/this/file/does/not/exist");

		Main.main(nonExistantFile.getAbsolutePath());

		then(nonExistantFile).doesNotExist();
	}
}
