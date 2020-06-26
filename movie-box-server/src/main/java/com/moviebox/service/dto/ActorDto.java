package com.moviebox.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Set;

/**
 * @author Elham
 * @since 6/26/2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ActorDto extends ArtistDto {
    private Date actingStartDate;
    private Set<MovieDto> movies;
}
