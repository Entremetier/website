package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoldenController {

    @RequestMapping({"golden", "golden.html"})
    public String viewBootstrap(){
        return "golden";
    }
}
