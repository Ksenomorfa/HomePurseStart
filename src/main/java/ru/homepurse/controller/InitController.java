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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        return "register";
    }

    @RequestMapping("/settings")
    public String setting(Model model) {
        model.addAttribute("settings", "Your settings:");

        return "settings";
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