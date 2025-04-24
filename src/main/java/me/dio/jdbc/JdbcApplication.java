package me.dio.jdbc;

import me.dio.jdbc.persistence.EmployeeDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {
	private EmployeeDAO employeeDAO = new EmployeeDAO();

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

}
