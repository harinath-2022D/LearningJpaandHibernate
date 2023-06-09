package com.example.DatabaseLearningwithJpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table // by default table name class name -> client
@Entity
public class Client {
    @Id
    private int id;
    private String name;
    private String funding;
    private String emailId;
    private String contactNo;
    private String address;

}
