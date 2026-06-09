/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fintrack.api;

/**
 *
 * @author Khushi
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // By extending JpaRepository, Spring automatically gives us methods like:
    // .save(), .findAll(), .findById(), and .deleteById() without writing any SQL!
}
