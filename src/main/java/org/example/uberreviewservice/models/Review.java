package org.example.uberreviewservice.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Review {

    @Id  //this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
     private Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)// this annotation tells spring about the formats of Date object to be stored i.e. Date/Time?Timestamp
    @CreatedDate  //this annotation tells spring that only handle it for object creation
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate   //this annotation tells spring that only handle it for object update
    private Date updatedAt;

}
