package com.team6.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.team6.domain.Event;

public interface EventRepository extends MongoRepository<Event, Long> {

}
