package services;

import model.RegistrationFormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormValidation {

    @Autowired
    private Registration userRegistrationService;


    public Boolean isEmailValid(RegistrationFormDataModel formData) {
        return userRegistrationService.isUnique(formData.getEmail());
    }

    public Boolean isAgeValid(RegistrationFormDataModel formData) {
        String age = formData.getAge();
        Boolean ageValidation = true;
        for(int i=0;i<age.length();i++) {
            int c = age.charAt(i) - '0';
            if(c>=0 && c<=9) {
                continue;
            }
            else {
                ageValidation = false;
                break;
            }
        }
    return ageValidation;
    }


}
