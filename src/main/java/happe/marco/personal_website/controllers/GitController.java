package happe.marco.personal_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GitController {

    @RequestMapping({"git", "git.html"})
    public String viewGit(){
        return "git";
    }
}
