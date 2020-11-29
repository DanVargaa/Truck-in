package com.backend.truckin.repositories;


import com.backend.truckin.models.ResumoSalario;
import org.springframework.data.repository.CrudRepository;

public interface ResumoRepository extends CrudRepository<ResumoSalario, Long> {
}
