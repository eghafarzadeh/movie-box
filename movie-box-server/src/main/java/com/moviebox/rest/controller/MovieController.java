package com.moviebox.rest.controller;

import com.moviebox.exception.MovieNotFoundException;
import com.moviebox.rest.RestModelConverter;
import com.moviebox.rest.model.MovieModel;
import com.moviebox.service.inf.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Elham
 * @since 7/1/2020
 */

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final RestModelConverter modelConverter;
    private final MovieService movieService;

    @Autowired
    public MovieController(RestModelConverter modelConverter, MovieService movieService) {
        this.modelConverter = modelConverter;
        this.movieService = movieService;
    }

    @GetMapping("")
    List<MovieModel> all() {
        return modelConverter.convert(movieService.findAll());
    }

    @GetMapping("/{id}")
    MovieModel findById(@PathVariable Long id) throws MovieNotFoundException {
        return modelConverter.convert(movieService.findById(id));
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    MovieModel addMovie(@Valid @RequestBody MovieModel newMovie) {
        return modelConverter.convert(movieService.addMovie(modelConverter.convert(newMovie)));
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    MovieModel updateMovie(@Valid @RequestBody MovieModel movie) {
        return modelConverter.convert(movieService.updateMovie(modelConverter.convert(movie)));
    }

    @DeleteMapping("/{id}")
    void deleteMovie(@PathVariable Long id) {
        movieService.deleteById(id);
    }
}
