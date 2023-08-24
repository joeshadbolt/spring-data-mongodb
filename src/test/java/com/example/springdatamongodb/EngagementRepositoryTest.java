package com.example.springdatamongodb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class EngagementRepositoryTest {

    @Autowired
    private EngagementRepository engagementRepository;

    @Autowired
    private ActivityRepository activityRepository;

    @Test
    void should_return_engagement_with_activities() {
        Engagement engagement = new Engagement();

        Engagement savedEngagement = engagementRepository.save(engagement);

        Activity activity = new Activity(savedEngagement);
        activityRepository.save(activity);

        Optional<Engagement> byId = engagementRepository.findById(engagement.getId());

        assertThat(byId.get().getActivities()).isNotEmpty();
    }
}
