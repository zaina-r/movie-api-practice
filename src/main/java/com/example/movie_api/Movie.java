package com.example.movie_api;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //Maps the class to a MongoDB Collection
@Data //Lombok property that handles getters setters and toString methods
@AllArgsConstructor//Creates a constructor taking all arguments
@NoArgsConstructor //Creates a constructor with no arguments
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //Stores only the review Ids while the actual reviews exist in a separate collection
    //Called manual reference relationships
    private List<Review> reviewIds;

}
