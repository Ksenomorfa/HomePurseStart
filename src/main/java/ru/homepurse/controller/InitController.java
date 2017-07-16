package ru.homepurse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InitController {

    @RequestMapping("/index")
    public String hello(Model model) {
        model.addAttribute("greeting", "Welcome to HomePurse");

        return "index";
    }
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String root(Model model) {

        return "redirect:/index";
    }

    @RequestMapping("/accounts")
    public String account(Model model) {
        model.addAttribute("accounts", "Your accounts:");

        return "accounts";
    }

    @RequestMapping("/flows")
    public String flow(Model model) {
        model.addAttribute("flows", "Your cash flows:");

        return "flows";
    }

    @RequestMapping("/reports")
    public String report(Model model) {
        model.addAttribute("reports", "Your reports:");

        return "reports";
    }
}