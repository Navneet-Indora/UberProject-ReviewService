package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
/*
@Temporal(TemporalType.TIMESTAMP) — Explained Simply
In JPA, @Temporal is used to tell Hibernate how to store Java Date or Calendar fields in the database.-Data,time,timestamp

@Column is used in JPA (and Hibernate) to customize how a Java field maps to a database column.-name,nullable, unique,length,columnDefinition,insertable,updatable,precision/scale

@MappedSuperclass tells JPA:“Include these fields in the child entity’s table.”

@DiscriminatorColumn(name = "type") in JPA
@DiscriminatorColumn is used with inheritance in JPA, specifically with the SINGLE_TABLE strategy, to identify the subclass of each row in the shared table.
 */
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseModel {

    @Id  //this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    protected Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)// this annotation tells spring about the formats of Date object to be stored i.e. Date/Time?Timestamp
    @CreatedDate  //this annotation tells spring that only handle it for object creation
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate   //this annotation tells spring that only handle it for object update
    protected Date updatedAt;


}
