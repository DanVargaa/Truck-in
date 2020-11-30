package com.backend.truckin.repositories;

import com.backend.truckin.models.Adm;
import com.backend.truckin.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmRepository extends CrudRepository<Adm, Long> {

    Iterable<Adm> findByCargo(String cargo);
    Adm findByCellPhone(String cellPhone);
    Adm deleteByCellPhone(String cellPhone);

}