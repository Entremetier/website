//package happe.marco.personal_website.mailComponent;
//
//import happe.marco.personal_website.domain.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailException;
//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Component;
//import org.thymeleaf.TemplateEngine;
//import org.thymeleaf.context.Context;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//@Component
//public class MailComponent {
//
//    @Autowired
//    private MailSender mailSender;
//
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    @Autowired
//    private TemplateEngine templateEngine;
//
////    public MailComponent(MailSender mailSender, JavaMailSender javaMailSender, TemplateEngine templateEngine) {
////        this.mailSender = mailSender;
////        this.javaMailSender = javaMailSender;
////        this.templateEngine = templateEngine;
////    }
//
//    public boolean sendSimpleMail(User user){
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom(user.getEmail());
//        mailMessage.setSubject(user.getSubject());
//        mailMessage.setText(user.getMessage());
//        mailMessage.setTo("marco.happe1982@gmail.com");
//
//        try {
//            mailSender.send(mailMessage);
//            return true;
//        } catch (MailException e){
//            System.err.println(e.getMessage());
//            return false;
//        }
//    }
//
//    public boolean sendHtmlMail(User user){
//        Context context = new Context();
//        context.setVariable("user", user);
//        final String messageHtml = templateEngine.process("email/contact", context);
//
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        MimeMessageHelper mailMessage = new MimeMessageHelper(mimeMessage);
//
//        try {
//            mailMessage.setTo("marco.happe1982@gmail.com");
//            mailMessage.setFrom(user.getEmail());
//            mailMessage.setSubject(user.getSubject());
//            mailMessage.setText(messageHtml, true);
//            javaMailSender.send(mimeMessage);
//            return true;
//        } catch (MessagingException | MailException e){
//            System.err.println(e.getMessage());
//            return false;
//        }
//    }
//}
