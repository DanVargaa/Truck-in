package com.backend.truckin.repositories;


import com.backend.truckin.models.HistoricoSessao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoRepository extends CrudRepository<HistoricoSessao, Long> {
}
