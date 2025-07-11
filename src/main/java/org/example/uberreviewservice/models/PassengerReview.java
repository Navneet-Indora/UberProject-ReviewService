package org.example.uberreviewservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends Review{
    @Column(nullable = false)
    private String PassengerReviewComment;

    @Column(nullable = false)
    private String PassengerRating;
}
