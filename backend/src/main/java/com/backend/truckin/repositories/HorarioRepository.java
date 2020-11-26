package com.backend.truckin.repositories;


import com.backend.truckin.models.HorarioTrab;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends CrudRepository<HorarioTrab, Long> {
   HorarioTrab findByIdMotoristaH(String PerfilId);
}
