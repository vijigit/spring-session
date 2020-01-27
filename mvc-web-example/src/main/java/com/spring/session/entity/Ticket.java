package com.spring.session.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    //	@ManyToOne(fetch = FetchType.LAZY)

    @ManyToOne
    @JoinColumn(name = "release_id")
    private Release release;

    private String status;

   
}
