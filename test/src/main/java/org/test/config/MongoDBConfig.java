package org.test.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import lombok.Getter;

@Getter
public class MongoDBConfig {
    private final String CONNECTION_URI = "mongodb+srv://hyper:anubis9878@cluster0.wvgeibc.mongodb.net/test";
    private final MongoClient mongoClient = MongoClients.create(CONNECTION_URI);
}
