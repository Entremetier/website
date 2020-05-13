package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JavaController {

    @RequestMapping({"java.html", "java"})
    public String javaPage(){
        return "java";
    }
}
