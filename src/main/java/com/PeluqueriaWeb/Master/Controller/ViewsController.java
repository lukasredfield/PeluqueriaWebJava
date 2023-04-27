package com.PeluqueriaWeb.Master.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ViewsController {

    @GetMapping("/")
    public RedirectView RedirectHome() {
        return new RedirectView("index.html");
    }

    @GetMapping("/about")
    public RedirectView RedirectAbout() {
        return new RedirectView("about.html");
    }

    @GetMapping("/thanks_you")
    public RedirectView RedirectThanks() {
        return new RedirectView("thanks_you.html");
    }

    @GetMapping("/services")
    public RedirectView Redirectservice() {
        return new RedirectView("services.html");
    }

    @GetMapping("/contact")
    public RedirectView RedirectContact() {
        return new RedirectView("contact.html");
    }
}
