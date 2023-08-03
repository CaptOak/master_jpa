package com.kay.jpa_course.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@NamedQueries(
        {

            @NamedQuery(
                    name = "Author.findByNamedQuery",
                    query = "select a from Author a where a.age >= :age"
            ),
            @NamedQuery(
                    name = "Author.updateByNamedQuery",
                    query = "update Author a set a.age=:age"
            )
        }
)
public class Author extends BaseEntity {


    @Column(name = "f_name", length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

//    @ManyToMany(mappedBy = "authors")
//    private List<Course> courses;


}
