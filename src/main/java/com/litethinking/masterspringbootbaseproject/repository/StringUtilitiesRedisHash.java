package com.litethinking.masterspringbootbaseproject.repository;

import com.litethinking.masterspringbootbaseproject.domain.StringPayload;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@RedisHash
public class StringUtilitiesRedisHash {
    @Id
    private UUID id;
    private final StringPayload stringPayload;

    public StringUtilitiesRedisHash(StringPayload stringPayload) {
        this.stringPayload = stringPayload;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public StringPayload getStringPayload() {
        return stringPayload;
    }
}
