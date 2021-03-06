package org.krasnoschek.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "org.krasnoschek.repository")
public class DataBaseConfig extends AbstractMongoConfiguration {

    @Override
    protected String getMappingBasePackage() {
        return "org.krasnoschek.repository";
    }

    @Override
    protected String getDatabaseName() {
        return "site";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }
}
