package com.kay.jpa_course.repositories;

import com.kay.jpa_course.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
