package org.test.config;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.reactive.RedisReactiveCommands;
import lombok.Getter;

@Getter
public class RedisConfig {
    private final String CONNECTION_URI = "redis://localhost:6379";
    private final RedisClient redisClient = RedisClient.create(CONNECTION_URI);
    private final StatefulRedisConnection<String, String> connection = redisClient.connect();
    private final RedisReactiveCommands<String, String> reactiveCommands = connection.reactive();
}
