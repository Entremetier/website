package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "index", "index.html"})
    public String viewIndex(){
        return "index";
    }
}
