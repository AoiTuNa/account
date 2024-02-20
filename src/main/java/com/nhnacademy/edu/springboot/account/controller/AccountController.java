package com.nhnacademy.edu.springboot.account.controller;

import com.nhnacademy.edu.springboot.account.domain.Account;
import com.nhnacademy.edu.springboot.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @GetMapping("/{id}")
    Account getAccount(@PathVariable("id")Long id){
        return  accountService.getAccount(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @DeleteMapping("/{id}")
    String deleteAccount(@PathVariable("id")Long id){
        return accountService.deleteAccount(id);
    }

}
