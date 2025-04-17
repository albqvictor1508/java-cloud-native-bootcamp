package dio.web.security.service;

import dio.web.security.entity.User;
import dio.web.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityDatabaseService implements UserDetailsService {
    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username)  {
        User userEntity = repository.findByUsername(username);
        if(userEntity.equals(null)) {
            throw new UsernameNotFoundException("The user %s not exists".formatted(username));
        }
        return null;
    }
}
