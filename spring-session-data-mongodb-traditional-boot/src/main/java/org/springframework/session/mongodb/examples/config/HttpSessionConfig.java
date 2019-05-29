/*
 * Copyright 2014-2016 the original author or authors.
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
package org.springframework.session.mongodb.examples.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.session.data.mongo.JdkMongoSessionConverter;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;

import static org.springframework.session.mongodb.examples.config.HttpSessionConfig.MONGO_TEMPLATE;


// tag::class[]
@EnableMongoHttpSession // <1>
@Configuration
@EnableMongoRepositories(basePackages = "org.springframework.session.data.mongo",
		mongoTemplateRef = MONGO_TEMPLATE)

public class HttpSessionConfig {

	protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";

	@Bean
	public JdkMongoSessionConverter jdkMongoSessionConverter() {
		return new JdkMongoSessionConverter(Duration.ofMinutes(30)); // <2>
	}
}
// end::class[]
