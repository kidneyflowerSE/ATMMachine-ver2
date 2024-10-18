package com.example.atmMachine.controller;

import org.springframework.web.bind.annotation.*;

import com.example.atmMachine.service.ATMService;

@RestController
@RequestMapping("/atm")
public class ATMController {

    private final ATMService atmService;

    public ATMController(ATMService atmService) {
        this.atmService = atmService;
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
        return atmService.deposit(amount);
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam double amount) {
        return atmService.withdraw(amount);
    }

    @GetMapping("/balance")
    public String checkBalance() {
        return atmService.checkBalance();
    }
}
