package com.moviebox.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

/**
 * @author Elham
 * @since 6/26/2020
 */
@EqualsAndHashCode(callSuper = true)
@Entity(name = "director")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Director extends Artist {

    @Column
    @Temporal(TemporalType.DATE)
    private Date directingStartDate;

    @OneToMany(mappedBy = "director")
    private Set<Movie> movies = new HashSet<>();
}
