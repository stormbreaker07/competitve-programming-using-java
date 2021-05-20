package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProcessForm {

    @RequestMapping("/processForm")
    public String processForm() {
        return "welcomePage";
    }

}
