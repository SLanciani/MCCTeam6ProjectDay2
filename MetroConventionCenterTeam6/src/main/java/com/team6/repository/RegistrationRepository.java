package com.team6.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.team6.domain.Registration;

public interface RegistrationRepository extends MongoRepository<Registration, Long>{

}
