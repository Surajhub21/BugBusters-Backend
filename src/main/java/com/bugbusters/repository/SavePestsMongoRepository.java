package com.bugbusters.repository;

import com.bugbusters.models.Pests;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SavePestsMongoRepository extends MongoRepository<Pests, ObjectId> {

    Pests getPestsById(ObjectId id);
}
