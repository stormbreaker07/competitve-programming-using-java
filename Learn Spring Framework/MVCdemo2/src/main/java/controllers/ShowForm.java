package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowForm {

    @RequestMapping("/showForm")
    public String showForm() {
        return "form";
    }

}
