package com.example.demo.domain;

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
    private Long usrUserNo;


    @Column(name = "USR_LOGIN_ID",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String usrLoginId;


    @Column(name = "USR_FNAME",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String usrFName = "";


    @Column(name = "USR_LNAME",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String usrLName = "";
}
