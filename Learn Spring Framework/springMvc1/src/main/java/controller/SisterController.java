package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisterController {

    @ResponseBody
    @RequestMapping("/makup")
    public String giveMakup() {
        return "ok take this makeup kit.";
    }
}
