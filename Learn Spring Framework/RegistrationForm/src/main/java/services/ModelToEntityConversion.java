package services;

import entity.UserRegistration;
import model.RegistrationFormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelToEntityConversion {



    public RegistrationFormDataModel toModel(UserRegistration entity) {
        RegistrationFormDataModel model = new RegistrationFormDataModel();
        model.setFirstName(entity.getFirstName());
        model.setLastName(entity.getLastName());
        model.setAge(String.valueOf(entity.getAge()));
        model.setEmail(entity.getEmail());
        model.setPassword(entity.getPassword());
        return model;
    }


    public UserRegistration toEntity(RegistrationFormDataModel model) {
        UserRegistration entity = new UserRegistration();
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setAge(Integer.parseInt(model.getAge()));
        entity.setEmail(model.getEmail());
        entity.setPassword(model.getPassword());
        return entity;
    }
}
