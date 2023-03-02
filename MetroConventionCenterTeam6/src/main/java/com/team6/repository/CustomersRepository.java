package com.team6.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.team6.domain.Customer;

public interface CustomersRepository extends MongoRepository<Customer, Long> {

}
