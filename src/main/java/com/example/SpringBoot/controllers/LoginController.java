package com.example.SpringBoot.controllers;

import com.example.SpringBoot.service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    //@Autowired
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    //Model
    @GetMapping("login")
    public String gotoLoginPage() {
        return "login";
    }

    @PostMapping("login")
    //login?name=Ranga RequestParam
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password,
                                  @RequestParam String quote,
                                  ModelMap model) {
        if(authenticationService.authenticate(name, password)) {
            model.put("name", name); //model let us save whatever entered in our jsp page and store it
            model.put("quote", quote);
            //Authentication
            //name - ali
            //password - 123

            return "welcome";
        }
        return "login";
    }
}
