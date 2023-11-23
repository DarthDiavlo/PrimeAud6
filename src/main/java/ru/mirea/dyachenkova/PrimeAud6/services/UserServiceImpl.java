package ru.mirea.dyachenkova.PrimeAud6.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.dyachenkova.PrimeAud6.entities.UserEntitity;
import ru.mirea.dyachenkova.PrimeAud6.repositories.UserRepository;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private  final UserRepository userRepository;

    @Override
    public UserEntitity getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
