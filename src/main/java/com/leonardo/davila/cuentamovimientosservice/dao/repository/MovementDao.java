package com.leonardo.davila.cuentamovimientosservice.dao.repository;

import com.leonardo.davila.cuentamovimientosservice.dao.entity.Movement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementDao extends CrudRepository<Movement, Long> {


}
