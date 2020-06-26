package com.moviebox.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Elham
 * @since 6/26/2020
 */
@EqualsAndHashCode(callSuper = true)
@Entity(name = "writer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Writer extends Artist {

    @Column
    @Temporal(TemporalType.DATE)
    private Date writingStartDate;

    @OneToMany(mappedBy = "writer")
    private List<Movie> movies = new ArrayList<>();

}
