# spring-data-mongodb
Issue sample using @DocumentReference for one-to-many relationship

# Problem

Attempting to use @DocumentReference annotation to retrieve child documents associated with parent results in the error `EL1007E: Property or field '_id' cannot be found on null`.

# Test to re-create 

See `com.example.springdatamongodb.EngagementRepositoryTest`.
