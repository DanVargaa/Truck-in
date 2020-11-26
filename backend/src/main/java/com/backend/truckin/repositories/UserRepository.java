package com.backend.truckin.repositories;

import com.backend.truckin.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
    User findById(long PerfilId);
    Iterable<User> findAllByName(String NomePesqUsu);

}
