package com.tut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InvalidSessionController {

    @RequestMapping(path = "/invalidSession", method = RequestMethod.GET)
    public String invalidSession() {
        return "invalid-session";
    }
}
