package org.example.uberreviewservice.services;

import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
    @Override
    public void run(String... args) throws Exception
    {
        Review r= Review.builder()
                .content("Nice Ride asdf")
                .rating(4.5).build(); // code to create plain java object
        reviewRepository.save(r);  // this code executes sql query
    }
}
