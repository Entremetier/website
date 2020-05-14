package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MySqlController {

    @RequestMapping({"mySql", "mySql.html"})
    public String viewMySql(){
        return "mySql";
    }
}
