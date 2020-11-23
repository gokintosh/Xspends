package com.gokul.springjpa.service;

import com.gokul.springjpa.model.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense>findAll();

    Expense save(Expense expense);
}
