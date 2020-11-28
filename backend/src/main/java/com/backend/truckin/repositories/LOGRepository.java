package com.backend.truckin.repositories;

import com.backend.truckin.models.Adm;
import com.backend.truckin.models.LOG;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LOGRepository extends CrudRepository<LOG, Long> {
}
