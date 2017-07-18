package ru.homepurse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.homepurse.data.PursesRepository;

@Controller
@RequestMapping("/purses")
public class PursesController {
    private PursesRepository pursesRepository;

    @Autowired
    public PursesController(PursesRepository pursesRepository) {
        this.pursesRepository = pursesRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String purse(Model model) {
        model.addAttribute("greeting", "Your purses:");
        model.addAttribute(pursesRepository.findPurses(Long.MAX_VALUE, 5));
        return "purses";
    }
}
