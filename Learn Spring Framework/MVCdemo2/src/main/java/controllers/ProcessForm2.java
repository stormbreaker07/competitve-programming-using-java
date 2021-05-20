package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class ProcessForm2 {

//    @RequestMapping("/processform2")
//    public String processForm2(HttpServletRequest request , Model model) {
//        String name = request.getParameter("firstName") + request.getParameter("lastName");
//        name = name.toUpperCase();
//        model.addAttribute("message" , name);
//        return "message1";
//    }

    @RequestMapping("/processform2")
    public String processForm2(@RequestParam("firstName") String name, Model model) {
        name = name.toUpperCase();
        model.addAttribute("message" , name);
        return "message1";
    }


}
