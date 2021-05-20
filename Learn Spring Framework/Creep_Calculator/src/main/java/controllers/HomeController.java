package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Model.*;
import services.GetUserData;

@Controller
public class HomeController {

    @Autowired
    GetUserData service ;

    @RequestMapping("/")
    public String Home() {
        return "Home-Page";
    }

    @RequestMapping("/process-homepage")
    public String processHomepage(HomeData homeData , Model model) {
        UserModel usermodel = new UserModel();


       usermodel.setUserName(homeData.getUserName());
       usermodel.setCrushName(homeData.getCrushName());

        service.addUserAndCrush(usermodel);
        model.addAttribute("homeData" ,homeData);
        return "Result-Page";
    }

}
