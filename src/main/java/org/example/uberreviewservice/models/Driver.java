package org.example.uberreviewservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Driver extends BaseModel {
    private String name;

    @Column(unique=true,nullable = false)
    private String licenseNumber;

    private String phoneNumber;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings;
}
