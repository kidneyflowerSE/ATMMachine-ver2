package com.example.atmMachine.service;

import org.springframework.stereotype.Service;

@Service
public class ATMService {
    private double total_balance = 500000;

    public String deposit(double amount) {
        total_balance += amount;
        return "Nạp tiền thành công, số dư tài khoản của bạn là: " + total_balance;
    }

    public String withdraw(double amount) {
        if (amount <= total_balance) {
            total_balance -= amount;
            return "Rút tiền thành công, số dư hiện tại là: " + total_balance;
        } else {
            return "Số dư không đủ để thực hiện giao dịch.";
        }
    }

    public String checkBalance() {
        return "Số dư hiện tại của bạn là: " + total_balance;
    }
}
