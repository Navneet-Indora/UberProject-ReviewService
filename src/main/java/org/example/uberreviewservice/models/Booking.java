package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
//In JPA, cascade is used to propagate operations (like save, delete, update) from a parent entity to its related child entities.
//
//Think of it like this:
//
//        "When I do something to the parent, should JPA automatically do the same to the children?"
//Cascade Type	What It Does
//ALL	   Applies all cascade types listed below
//PERSIST	When you save the parent, also save the child
//MERGE	   When you update (merge) the parent, also merge the child
//REMOVE	When you delete the parent, also delete the child
//REFRESH	When you refresh the parent, also refresh the child
//DETACH	When you detach the parent from the persistence context, do same for child
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseModel {

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})//
    private Review review;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingstatus;

    @Temporal(value= TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value= TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne(fetch=FetchType.LAZY)
    private Driver driver;

    @ManyToOne(fetch=FetchType.LAZY)
    private Passenger passenger;

}
