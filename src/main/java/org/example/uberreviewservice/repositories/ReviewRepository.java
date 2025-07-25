package org.example.uberreviewservice.repositories;

import jakarta.persistence.Id;
import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
