package ru.mirea.dyachenkova.PrimeAud6.services;

import ru.mirea.dyachenkova.PrimeAud6.entities.UserEntitity;

import java.util.Optional;

public interface UserService {
    UserEntitity getUser(int id);
}
