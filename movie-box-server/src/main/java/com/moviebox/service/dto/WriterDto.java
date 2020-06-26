package com.moviebox.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Elham
 * @since 6/26/2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WriterDto extends ArtistDto {
    private Date writingStartDate;
    private List<MovieDto> movies = new ArrayList<>();
}
