package com.example.OneToOne.Domain;

import com.example.OneToOne.Persistence.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "email")
public class Email extends Model {
    @Column
    private String emailId;
    @OneToOne(mappedBy="email")
    @JsonIgnoreProperties("email")
    private Users user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(emailId, email.emailId) && Objects.equals(user, email.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, user);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Email(String emailId) {
        this.emailId = emailId;
    }
    Email(){
        super();
    }
}
