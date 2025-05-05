package com.bugbusters.repository;

import com.bugbusters.models.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review , ObjectId> {
}
