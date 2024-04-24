package com.litethinking.masterspringbootbaseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StringUtilitiesRedisRepository extends CrudRepository<StringUtilitiesRedisHash, UUID> {
}
