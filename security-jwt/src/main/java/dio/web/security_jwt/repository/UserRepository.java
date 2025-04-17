package dio.web.security_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.web.security_jwt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT u FROM users u WHERE u.username = :username", nativeQuery = true)
    public void findByUsername(@Param("username") String username);    

    public boolean existsByUsername();
}
