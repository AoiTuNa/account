package com.nhnacademy.edu.springboot.account.controller;

import com.nhnacademy.edu.springboot.account.domain.Account;
import com.nhnacademy.edu.springboot.account.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class WebAccountController {
    private final AccountService service;

    @GetMapping("/web/account/{id}")
    public String getAccount(@PathVariable Long id, Model model)
    {
        Account account = service.getAccount(id);
        model.addAttribute("account", account);

        return "account";
    }
}
