package com.backend.truckin.repositories;

import com.backend.truckin.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    static final List<User> users = new ArrayList<User>();


    User findByName(String name);
    User findById(long PerfilId);

    Iterable<User> findAllByName(String NomePesqUsu);

}

