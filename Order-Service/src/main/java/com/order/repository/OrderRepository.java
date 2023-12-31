package com.order.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.order.model.Orders;

@Repository
public interface OrderRepository extends MongoRepository<Orders, String> {

	List<Orders> findByProfileId(String profileId);
	
	
}

