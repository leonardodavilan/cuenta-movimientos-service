package com.leonardo.davila.cuentamovimientosservice.dao.repository;

import com.leonardo.davila.cuentamovimientosservice.dao.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends CrudRepository<Account, Integer> {

}
