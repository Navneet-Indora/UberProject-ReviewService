package org.example.uberreviewservice.services;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.BookingRepository;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private final BookingRepository bookingRepository;
    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception
    {
        Review r= Review.builder()
                .content("Nice Ride asdf")
                .rating(4.5).build(); // code to create plain java object

           Booking b= Booking
                      .builder()
                      .endTime (new Date())
                      .build();
           System.out.println(r);
           bookingRepository.save(b);
          reviewRepository.save(r);  // this code executes sql query
    }
}
