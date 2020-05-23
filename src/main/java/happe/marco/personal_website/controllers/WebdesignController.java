package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebdesignController {

    @RequestMapping({"webdesign", "webdesign.html"})
    public String viewJava(){
        return "webdesign";
    }
}
