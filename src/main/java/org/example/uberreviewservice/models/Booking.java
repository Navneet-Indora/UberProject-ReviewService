package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseModel {

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Review review;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingstatus;

    @Temporal(value= TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value= TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;

}
