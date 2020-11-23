package com.gokul.springjpa.service;

import com.gokul.springjpa.model.Expense;
import com.gokul.springjpa.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense save(Expense expense) {
        expenseRepository.save(expense);
        return expense;
    }
}
