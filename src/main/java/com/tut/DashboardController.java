package com.tut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("welcomeModel")
public class DashboardController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardController.class);

    @GetMapping("/dashboard")
    public String dashboard(Model model, @ModelAttribute("welcomeModel") WelcomeModel welcomeModel, RedirectAttributes redirectAttributes) {
        if (welcomeModel.isEmpty()) {
            LOGGER.error("Welcome model is not valid.");
            redirectAttributes.addFlashAttribute("nameRequiredMessage", "Name is required");
            return "redirect:/";
        }
        LOGGER.info(welcomeModel.getName());
        model.addAttribute("name", welcomeModel.getName());

        return "dashboard";
    }
}
