package com.rocha.monitorfinancas.services;

import com.rocha.monitorfinancas.model.jpa.Income;
import com.rocha.monitorfinancas.repositories.IncomeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IncomeService {

    private final IncomeRepository incomeRepository;

    public List<Income> findAll() {
        return incomeRepository.findAll();
    }
}
