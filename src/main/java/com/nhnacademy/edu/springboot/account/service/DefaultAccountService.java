package com.nhnacademy.edu.springboot.account.service;

import com.nhnacademy.edu.springboot.account.domain.Account;
import com.nhnacademy.edu.springboot.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAccountService implements AccountService{

    private final AccountRepository accountRepository;
    public DefaultAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account createAccount(Account account) {
        if(accountRepository.existsById(account.getId())){
            throw new IllegalStateException("id :" + account.getId() + " is already");
        }
        return account;
    }

    @Override
    public String deleteAccount(Long id) {
        accountRepository.deleteById(id);
        return "OK";
    }

    

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }


}
