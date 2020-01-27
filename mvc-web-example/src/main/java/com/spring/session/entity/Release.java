package com.spring.session.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Release {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer release_id;
    private String releaseDate;
    private String description;

   
}
