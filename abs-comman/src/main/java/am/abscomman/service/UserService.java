package am.abscomman.service;

import am.abscomman.model.User;
import am.abscomman.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepo;

    public User save(User user) {
        userRepo.save(user);
        return user;
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public Optional<User> findByEmail(String email) {
        return userRepo.findByEmail(email);
    }
    public Optional<User> findByUsername (String username) {
        return userRepo.findByUsername(username);
    }
}
