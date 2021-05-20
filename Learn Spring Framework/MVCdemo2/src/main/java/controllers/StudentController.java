package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student1")
    public String studentController(Model model1) {

        Student student = new Student();
        model1.addAttribute("student" , student);
        return "StudentForm";
    }

    @RequestMapping("/ProcessForm3")
    public String modelhandler(@ModelAttribute("student") Student student) {
        return "student-confirmation";
    }
}
