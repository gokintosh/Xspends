package com.gokul.springjpa.repository;

import com.gokul.springjpa.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}
