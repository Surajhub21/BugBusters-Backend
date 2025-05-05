package com.bugbusters.repository;

import com.bugbusters.models.Pricing;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SavePricingRepository extends MongoRepository<Pricing, ObjectId> {
}
