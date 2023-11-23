package ru.mirea.dyachenkova.PrimeAud6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.dyachenkova.PrimeAud6.entities.UserEntitity;

@Repository
public interface UserRepository extends JpaRepository<UserEntitity, Integer> {

}
