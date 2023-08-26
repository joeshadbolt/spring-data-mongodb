package com.example.springdatamongodb;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "engagements")
public class Engagement {

    @Id
    private ObjectId id;

    @NonNull
    private String name;

    @ReadOnlyProperty
    @DocumentReference(lookup="{'engagementId':?#{#self._id}}")
    private List<Activity> activities = new ArrayList<>();
}
