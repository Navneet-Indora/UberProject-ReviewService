package org.example.uberreviewservice.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
/*
@Entity is a JPA annotation that marks a Java class as a database entity — meaning it maps to a table in the database.
 @EntityListeners(AuditingEntityListener.class) — What It Does
This annotation is used in Spring Data JPA to enable automatic population of audit fields, like:
@CreatedDate
@LastModifiedDate
@CreatedBy
@LastModifiedBy



 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name="bookingreview")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{


    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Double rating;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking; // we have defined a 1:1 relationship between booking and review

    @Override
    public String toString() {
        return "Review: " + this.content + " " + this.rating + " " + " booking: " + this.booking.getId() + " " + this.createdAt;
    }

}

