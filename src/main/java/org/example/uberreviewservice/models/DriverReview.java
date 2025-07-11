package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "driver_review_id" )//@PrimaryKeyJoinColumn(name = "driver_review_id", referencedColumnName = "id") to rename the pk column
public class DriverReview extends Review {
    private String driverReviewComment;
}
