package ru.homepurse.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import ru.homepurse.data.PursesRepository;
import ru.homepurse.pojo.Profile;
import ru.homepurse.pojo.Purse;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class InitControllerTest {

    @Test
    public void testController() {
        InitController initController = new InitController();
        assertEquals("redirect:/login", initController.root());
    }

    @Test
    public void testControllerIndex() throws Exception {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        InitController initController = new InitController();

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(initController)
                .setViewResolvers(viewResolver).build();
        mockMvc.perform(get("/index")).andExpect(view().name("index"));
    }

    @Test
    public void testAccounts() throws Exception {
        List<Purse> purses =createAccountList(5);
        PursesRepository pursesRepository = mock(PursesRepository.class);
        when(pursesRepository.findPurses(Long.MAX_VALUE,5))
                .thenReturn(purses);

        PursesController pursesController = new PursesController(pursesRepository);
        MockMvc mockMVC = MockMvcBuilders.standaloneSetup(pursesController)
                .setSingleView(new InternalResourceView("/WEB-INF/pages/account.jsp"))
                .build();

        mockMVC.perform(get("/purses")).andExpect(view().name("purses"))
                .andExpect(model().attributeExists("accountList"))
                .andExpect(model().attribute("accountList",hasItems(purses.toArray())));
    }

    private List<Purse> createAccountList(int count) {
        List<Purse> purses = new ArrayList<>();
        for (int i=0;i<count;i++) {
            purses.add(new Purse("№" + i,new Profile("Russia")));
        }
        return purses;
    }
}