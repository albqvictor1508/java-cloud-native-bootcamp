package me.dio.jdbc;

import me.dio.jdbc.persistence.EmployeeDAO;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {
	private EmployeeDAO employeeDAO = new EmployeeDAO();

	public static void main(String[] args) {
		var flyway = Flyway.configure()
				.dataSource("jdbc:mysql://localhost:6000/jdbc-basics", "root", "mysql-pass")
				.load();
		flyway.migrate();

		SpringApplication.run(JdbcApplication.class, args);
	}
}
