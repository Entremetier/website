package happe.marco.personal_website.controllers;

import happe.marco.personal_website.domain.User;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {

//    private final MailComponent mailComponent;
//
//    public IndexController(MailComponent mailComponent) {
//        this.mailComponent = mailComponent;
//    }

    private final MailSender mailSender;

    public IndexController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @GetMapping({"/", "index", "index.html"})
    public String viewIndex() {
        return "index";
    }

//    @PostMapping("/")
//    public String processContact(@Validated User user, RedirectAttributes model, BindingResult bindingResult) {
//        if (bindingResult.hasErrors())
//            return "index";
//
//        if (mailComponent.sendSimpleMail(user)) {
//            model.addFlashAttribute("classCss", "alert alert-success");
//            model.addFlashAttribute("message", "Ihre Nachricht wurde verschickt");
//        } else {
//            model.addFlashAttribute("classCss", "alert alert-warning");
//            model.addFlashAttribute("message", "Ein Unerwarter Fehler ist aufgetreten, bitte versuchen Sie es zu " +
//                    "einem späteren Zeitpunkt nochmal oder benutzen Sie, alternativ, die sozialen Medien um mit mir in" +
//                    "Kontakt zu treten.");
//        }
//        return "redirect:/";
//
//    }

    @PostMapping("/")
    public String processContact(@Validated User user, RedirectAttributes model) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(user.getEmail());
        mailMessage.setSubject(user.getSubject());
        mailMessage.setText(user.getMessage());
        mailMessage.setTo("marco.happe1982@gmail.com");

        try {
            mailSender.send(mailMessage);
        }catch (MailException e){
            System.out.println("Fehler beim Senden der Mail: " + e.getMessage());
        }

        return "redirect:/";

    }
}

