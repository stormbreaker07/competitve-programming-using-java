package controllers;

import model.RegistrationFormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.FormValidation;
import services.Registration;

import java.util.List;

@Controller
public class RegisterUser {

    @Autowired
    private Registration userRegistrationService;
    @Autowired
    private FormValidation formValidation;


    @GetMapping("/")
    public String registrationForm() {
        return "form";
    }

    @PostMapping("/process-form")
    public String processRegistrationForm(RegistrationFormDataModel formData , Model theModel) {
        System.out.println(formData);
        //check if email is unique and age is integer and password contain all type of character
        //if yes ,extract all data from the database and show it on registeredUser.jsp
        //if no ,then send back to registration form with a warning of invalid data.

        Boolean isEmailValid = formValidation.isEmailValid(formData);
        Boolean isAgeValid = formValidation.isAgeValid(formData);

      if(isEmailValid && isAgeValid) {
            userRegistrationService.registerUser(formData);
            List<RegistrationFormDataModel> list = userRegistrationService.getAllUserDetails();
            theModel.addAttribute("list" , list);
            return "registeredUser";
        }
        else {
            String ageWarning = "Fill Valid Age in numbers";
            String emailWarning = "User Already Exist On This Email Id Plz Try Again";
            String warning = "Fill Age and Email Id correctly , a user already exist on this Email";
            if(isAgeValid == true && isEmailValid == false) {
                theModel.addAttribute("Warning" ,emailWarning );
            }
            else if(isAgeValid == false && isEmailValid == true) {
                theModel.addAttribute("Warning" ,ageWarning );
            }
            else if(isAgeValid == false && isEmailValid==false) {
                theModel.addAttribute("Warning" , warning);
            }

            return "form";
        }
    }




}
