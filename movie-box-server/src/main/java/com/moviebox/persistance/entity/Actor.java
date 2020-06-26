package com.moviebox.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author Elham
 * @since 6/26/2020
 */
@EqualsAndHashCode(callSuper = true)
@Entity(name = "actor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor extends Artist {

    @Column
    @Temporal(TemporalType.DATE)
    private Date actingStartDate;

    @ManyToMany(mappedBy = "actors")
    private Set<Movie> movies;
}
