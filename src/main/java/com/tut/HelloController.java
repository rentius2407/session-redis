package com.tut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("welcomeModel")
public class HelloController {

    @ModelAttribute("welcomeModel")
    public WelcomeModel welcomeModel() {
        return new WelcomeModel();
    }

    @GetMapping("/")
    public String welcome(Model model, @ModelAttribute("nameRequiredMessage") String nameRequiredMessage) {
        model.addAttribute("signIn", new SignIn());

        if (nameRequiredMessage != null && !nameRequiredMessage.isBlank()) {
            model.addAttribute("nameRequiredMessage", nameRequiredMessage);
        }

        return "welcome";
    }

    @PostMapping("/signIn")
    public String signIn(@ModelAttribute("signIn") SignIn signIn, @ModelAttribute WelcomeModel welcomeModel) {
        welcomeModel.setName(signIn.getName());
        return "redirect:/dashboard";
    }
}
