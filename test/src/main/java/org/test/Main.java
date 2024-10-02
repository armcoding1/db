package org.test;

import com.mongodb.reactivestreams.client.MongoClient;
import io.lettuce.core.api.reactive.RedisReactiveCommands;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.test.config.MongoDBConfig;
import org.test.config.RedisConfig;
import org.test.config.SQLConfig;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SQLConfig sqlConfig = new SQLConfig();
        Session session = sqlConfig.getSession();
        session.close();
        logger.info("Connected to SQL Database");

        RedisConfig redisConfig = new RedisConfig();
        RedisReactiveCommands<String, String> reactiveCommands = redisConfig.getReactiveCommands();
        logger.info("Connected to Redis Database");

        MongoDBConfig mongoDBConfig = new MongoDBConfig();
        MongoClient mongoClient = mongoDBConfig.getMongoClient();
        mongoClient.close();
        logger.info("Connected to MongoDB Database");
    }
}