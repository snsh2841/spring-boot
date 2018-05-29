package com.example.demo.core.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {

    @Column(name = "USR_USER_NO",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonSerialize
    private Long usrUserNo;


    @Column(name = "USR_LOGIN_ID",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @JsonSerialize
    private String usrLoginId;


    @Column(name = "USR_FNAME",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @JsonSerialize
    private String usrFName = "";


    @Column(name = "USR_LNAME",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @JsonSerialize
    private String usrLName = "";
}
