package ru.homepurse.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;
import ru.homepurse.data.AccountsRepository;
import ru.homepurse.pojo.Account;
import ru.homepurse.pojo.Profile;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.*;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class InitControllerTest {

    @Test
    public void testController() {
        InitController initController = new InitController();
        assertEquals("redirect:/index", initController.root());
    }

    @Test
    public void testAccounts() throws Exception {
        List<Account> accounts =createAccountList(5);
        AccountsRepository accountsRepository = mock(AccountsRepository.class);
        when(accountsRepository.findAccounts(Long.MAX_VALUE,5))
                .thenReturn(accounts);

        AccountsController accountsController = new AccountsController(accountsRepository);
        MockMvc mockMVC = MockMvcBuilders.standaloneSetup(accountsController)
                .setSingleView(new InternalResourceView("/WEB-INF/pages/account.jsp"))
                .build();

        mockMVC.perform(get("/accounts")).andExpect(view().name("accounts"))
                .andExpect(model().attributeExists("accountList"))
                .andExpect(model().attribute("accountList",hasItems(accounts.toArray())));
    }

    private List<Account> createAccountList(int count) {
        List<Account> accounts = new ArrayList<>();
        for (int i=0;i<count;i++) {
            accounts.add(new Account("№" + i,new Profile("Polina","Russia")));
        }
        return accounts;
    }
}