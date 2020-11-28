package com.backend.truckin.repositories;


import com.backend.truckin.models.SessaoTrabalho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public interface SessaoRepository extends CrudRepository<SessaoTrabalho, Long>
{
    Iterable<SessaoTrabalho> findById(long id);
    Iterable<SessaoTrabalho> findByIdMotAndStatus(long id, long status);
    Iterable<SessaoTrabalho> findByStatus(long status);
}
