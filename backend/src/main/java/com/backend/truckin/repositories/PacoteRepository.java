package com.backend.truckin.repositories;

import com.backend.truckin.models.Adm;
import com.backend.truckin.models.Pacote;
import com.backend.truckin.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface PacoteRepository extends CrudRepository<Pacote, Long>
    {
        Iterable<Pacote>  findByIdMotorista(String PerfilId);
        Pacote findById(long idPac);
    }

