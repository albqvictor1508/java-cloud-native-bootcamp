package me.dio.jdbc.persistence.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class Employee {
    private Long id;
    private BigDecimal salary;
    private String name;
    private OffsetDateTime birthday;
}
