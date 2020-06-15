package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/", "index", "index.html"})
    public String viewIndex() {
        return "index";
    }

}

