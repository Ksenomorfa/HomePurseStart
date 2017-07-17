package ru.homepurse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.homepurse.data.AccountsRepository;

@Controller
@RequestMapping("/accounts")
public class AccountsController {
    private AccountsRepository accountsRepository;

    @Autowired
    public AccountsController(AccountsRepository accountsRepository){
        this.accountsRepository = accountsRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String account(Model model) {
        model.addAttribute(accountsRepository.findAccounts(Long.MAX_VALUE,5));
        return "accounts";
    }

}
