///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.fintrack.api;
//
///**
// *
// * @author Khushi
// */
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/transactions") // Base URL route for all finance actions
//public class GreetingController {
//
//    @Autowired
//    private TransactionRepository transactionRepository;
//
//    // 1. CREATE: Add a new transaction (Expense/Income)
//    @PostMapping
//    public Transaction createTransaction(@RequestBody Transaction transaction) {
//        return transactionRepository.save(transaction);
//    }
//
//    // 2. READ ALL: Fetch every transaction logged so far
//    @GetMapping
//    public List<Transaction> getAllTransactions() {
//        return transactionRepository.findAll();
//    }
//
//    // 3. DELETE: Remove a specific transaction using its ID
//    @DeleteMapping("/{id}")
//    public String deleteTransaction(@PathVariable Long id) {
//        if (transactionRepository.existsById(id)) {
//            transactionRepository.deleteById(id);
//            return "Transaction with ID " + id + " was deleted successfully.";
//        }
//        return "Transaction ID not found.";
//    }
//}
package com.fintrack.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*")
public class GreetingController {

    @Autowired
    private TransactionRepository repository;

    @GetMapping
    public List<Transaction> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return repository.save(transaction);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}