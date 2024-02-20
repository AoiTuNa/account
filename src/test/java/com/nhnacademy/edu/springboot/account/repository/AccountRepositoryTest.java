package com.nhnacademy.edu.springboot.account.repository;

import com.nhnacademy.edu.springboot.account.domain.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AccountRepositoryTest {

    AccountRepository accountRepository;

    @Test
    void testAccountRepository(){
        Account zbum = new Account(1L,"zbum",100);
        accountRepository.save(zbum);
        List<Account> actual = accountRepository.findAll();
        Assertions.assertThat(actual).hasSize(1);

    }
}
