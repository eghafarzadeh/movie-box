package com.moviebox.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Elham
 * @since 6/26/2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DirectorDto extends ArtistDto {
    private Date directingStartDate;
    private Set<MovieDto> movies = new HashSet<>();
}
