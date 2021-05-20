package controllers;

import ModelStructure.YearAndSem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class HomepageController {


    @GetMapping(value = "/")
    public String getHomePage(Model theModel){

        theModel.addAttribute("yearAndSem",new YearAndSem());
        return "index";
    }

}
