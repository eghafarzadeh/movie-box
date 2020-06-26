package com.moviebox.persistance.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author Elham
 * @since 6/25/2020
 */
@Entity
@Table(name = "movie", uniqueConstraints = {
        @UniqueConstraint(name = "UK_MOVIE_1", columnNames = {"name"})},
        indexes = {
                @Index(name = "MOVIE_NAME", columnList = "name"),
                @Index(name = "MOVIE_DESCRIPTION", columnList = "description")
        })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOVIE_SEQ")
    @SequenceGenerator(sequenceName = "movie_seq", allocationSize = 1, name = "MOVIE_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "NVARCHAR2(100)", nullable = false)
    @NotNull
    private String name;

    @Column(name = "description", columnDefinition = "NVARCHAR2(256)")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_director")
    @NotNull
    private Director director;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_writer")
    @NotNull
    private Writer writer;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor> actors;

    @Lob
    @NotNull
    @Column(name = "poster", columnDefinition = "BLOB")
    private byte[] poster;

    @Lob
    @NotNull
    @Column(name = "content", columnDefinition = "BLOB")
    private byte[] content;

}
