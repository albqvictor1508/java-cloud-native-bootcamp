package dio.web.security_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.web.security_jwt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
}
