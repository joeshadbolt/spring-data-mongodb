package com.example.springdatamongodb;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@Document(collection = "activities")
public class Activity {
    @Id
    private ObjectId id;

    @NonNull
    @DocumentReference
    private Engagement engagement;

}
