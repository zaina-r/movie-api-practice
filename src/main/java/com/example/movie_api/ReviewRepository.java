package com.example.movie_api;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReadPreference;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
