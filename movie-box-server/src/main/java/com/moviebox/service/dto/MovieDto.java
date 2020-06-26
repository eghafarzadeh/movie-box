package com.moviebox.service.dto;

import lombok.Data;

import java.util.Set;

/**
 * @author Elham
 * @since 6/26/2020
 */
@Data
public class MovieDto {
    private String name;
    private String description;
    private DirectorDto director;
    private WriterDto writer;
    private Set<ActorDto> actors;
    private byte[] poster;
    private byte[] content;
}
