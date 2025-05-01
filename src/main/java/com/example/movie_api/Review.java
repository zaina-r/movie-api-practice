package com.example.movie_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private ObjectId id;
    private String body;

    //Create a constructor with only the bosy as an argument because the IDs are auto generated, hence no need to pass it using a constructor
    public Review(String body) {
        this.body = body;
    }
}
