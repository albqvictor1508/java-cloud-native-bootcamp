package me.dio.jdbc.persistence.entity;

import lombok.Data;

@Data
public class Contact {

    private long id;

    private String description;

    private String type;

    private Employee employee;

}