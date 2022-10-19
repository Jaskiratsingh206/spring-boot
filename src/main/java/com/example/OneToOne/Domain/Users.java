package com.example.OneToOne.Domain;

import com.example.OneToOne.Persistence.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name ="users")
public class Users extends Model {
    @Column
    private String name;

    @OneToOne
    @JoinTable(name="users_email",
               joinColumns = @JoinColumn(name="users_id"),
               inverseJoinColumns = @JoinColumn(name="email_id"))
    @JsonIgnoreProperties("user")
    private Email email;

    public Users(String name, Email email) {
        this.name = name;
        this.email = email;
    }
    Users(){
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
