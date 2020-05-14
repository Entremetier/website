package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootstrapController {

    @RequestMapping({"bootstrap-sass", "bootstrap-sass.html"})
    public String viewBootstrap(){
        return "bootstrap-sass";
    }
}
