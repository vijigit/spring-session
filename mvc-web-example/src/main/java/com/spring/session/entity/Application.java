package com.spring.session.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Application {

    @Id
    @Column(name="application_id")
    private Integer id;

    @Column(name = "app_name", nullable = false)
    private String name;

    @Column(length = 2000)
    private String description;
    private String owner;

}
