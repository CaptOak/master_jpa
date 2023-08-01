package com.kay.jpa_course.repositories;

import com.kay.jpa_course.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRespository extends JpaRepository<Video, Integer> {
}
