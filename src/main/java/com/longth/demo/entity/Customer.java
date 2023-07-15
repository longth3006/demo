package com.longth.demo.entity;

import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="fullName")
    private String fullName;

    @Column(name="birthday")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Customer(){

    };

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
