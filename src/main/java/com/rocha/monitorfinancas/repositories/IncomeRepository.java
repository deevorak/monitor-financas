package com.rocha.monitorfinancas.repositories;

import com.rocha.monitorfinancas.model.jpa.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}
