package org.springframework.session.mongodb.examples.config;/*
package org.springframework.session.mongodb.examples.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static org.springframework.session.mongodb.examples.config.SecondaryMongoConfig.MONGO_TEMPLATE;


*/
/**
 * @author Marcos Barbero
 *//*

@Configuration
@EnableMongoRepositories(basePackages = "org.springframework.session.mongodb.examples.repository.secondary",
        mongoTemplateRef = MONGO_TEMPLATE)
public class SecondaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
*/
// public class SecondaryMongoConfig {
//    protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
//
//}