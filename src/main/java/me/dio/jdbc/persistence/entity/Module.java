package me.dio.jdbc.persistence.entity;

import java.util.List;

import lombok.Data;

@Data
public class Module {

    private long id;

    private String name;

    private List<Employee> employees;

}