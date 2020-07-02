package com.moviebox.service;

import com.moviebox.persistance.entity.Movie;
import com.moviebox.service.dto.MovieDto;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Elham
 * @since 6/26/2020
 */
@Mapper(componentModel = "spring")
public interface ModelConverter {
    List<MovieDto> convert(List<Movie> movie);

    MovieDto convert(Movie movie);

    Movie convert(MovieDto movie);
}
