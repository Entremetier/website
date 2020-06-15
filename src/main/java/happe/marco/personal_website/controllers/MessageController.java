package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    @RequestMapping("/message")
    public String showMessage(){
        return "message";
    }
}
