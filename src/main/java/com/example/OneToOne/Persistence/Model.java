package com.example.OneToOne.Persistence;

import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.Generated;
import javax.persistence.*;

@MappedSuperclass
public abstract class Model {
    @Id
    @Generated(GenerationTime.INSERT)
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;

    public Long getId() {
        return id;
    }
}
