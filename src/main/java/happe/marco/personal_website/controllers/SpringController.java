package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

    @RequestMapping({"spring-framework", "spring-framework.html"})
    public String viewSpring(){
        return "spring-framework";
    }
}
