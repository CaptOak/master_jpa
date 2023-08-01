package com.kay.jpa_course.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author {


    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "f_name", length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

//    @Column(updatable = false, nullable = false)
//    private LocalDateTime createdAt;
//
//    @Column(insertable = false)
//    private LocalDateTime lastModified;


}
