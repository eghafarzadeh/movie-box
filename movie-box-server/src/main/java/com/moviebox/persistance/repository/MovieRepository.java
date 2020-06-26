package com.moviebox.persistance.repository;

import com.moviebox.persistance.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Elham
 * @since 6/26/2020
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
