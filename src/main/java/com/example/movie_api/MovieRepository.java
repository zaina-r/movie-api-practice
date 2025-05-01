package com.example.movie_api;

import com.example.movie_api.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
//Extends the mongo repository and mentions the data and the id that we will be handling
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
