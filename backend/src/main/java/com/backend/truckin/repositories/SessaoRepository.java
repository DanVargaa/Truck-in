package com.backend.truckin.repositories;


import com.backend.truckin.models.SessaoTrabalho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoRepository extends CrudRepository<SessaoTrabalho, Long> {
}
