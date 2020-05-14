package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping({"html-css.html", "html-css"})
    public String viewJava(){
        return "html-css";
    }
}
