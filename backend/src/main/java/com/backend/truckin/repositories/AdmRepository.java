package com.backend.truckin.repositories;

import com.backend.truckin.models.Adm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmRepository extends CrudRepository<Adm, Long> {
}