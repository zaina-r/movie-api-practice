package com.example.movie_api;

import com.example.movie_api.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
//Extends the mongo repository and mentions the data and the id that we will be handling
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findMovieByImdbId(String imdbId);// Creates a method which allows us to find movies using the imdb without using the id which is the default option
}
