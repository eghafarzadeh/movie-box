package com.moviebox.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Elham
 * @since 6/26/2020
 */
@Entity
@Table(name = "artist", indexes = {
                @Index(name = "ARTIST_NAME", columnList = "first_name,last_name")
        })
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTIST_SEQ")
    @SequenceGenerator(sequenceName = "artist_seq", allocationSize = 1, name = "ARTIST_SEQ")
    private Long id;


    @Column(name = "first_name", columnDefinition = "NVARCHAR2(50)", nullable = false)
    @NotNull
    private String firstName;

    @Column(name = "last_name", columnDefinition = "NVARCHAR2(50)", nullable = false)
    @NotNull
    private String lastName;
}
