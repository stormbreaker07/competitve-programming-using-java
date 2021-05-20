package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BrotherController {

    @ResponseBody
    @RequestMapping("/football")
    public String giveFootball() {
        return "ok ! take the football and give it back before 4 pm";
    }

}
