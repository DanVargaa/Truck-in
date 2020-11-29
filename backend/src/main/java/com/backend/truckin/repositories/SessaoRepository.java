package com.backend.truckin.repositories;


import com.backend.truckin.models.SessaoTrabalho;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Repository
public interface SessaoRepository extends CrudRepository<SessaoTrabalho, Long>
{
//    value = "from EntityClassTable t where yourDate BETWEEN :startDate AND :endDate"
    @Query("FROM sessaoTrabalho WHERE idMot = :idMot AND created_at  BETWEEN :ini AND :end ")
    List<SessaoTrabalho> findByCreated_AtAndIdMotBetween(@Param("ini") Date ini, @Param("end") Date end, @Param("idMot")long idMot);
    SessaoTrabalho findById(long id);
    Iterable<SessaoTrabalho> findByIdMotAndStatus(long id, long status);
    List<SessaoTrabalho>  findByIdMot(long idMot);
    Iterable<SessaoTrabalho> findByStatus(long status);

}
