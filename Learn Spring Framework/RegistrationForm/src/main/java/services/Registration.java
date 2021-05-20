package services;


import entity.UserRegistration;
import model.RegistrationFormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.CrudOperation;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class Registration {

    @Autowired
    private CrudOperation operation;
    @Autowired
    private ModelToEntityConversion conversion;


    public void registerUser(RegistrationFormDataModel dataModel) {
        UserRegistration user = new UserRegistration();
        user = conversion.toEntity(dataModel);

        operation.add(user);
    }

    public Boolean isUnique(String Email) {
        List<UserRegistration> list = operation.findByEmail(Email);
        if(list.size() >0) {
            return false;
        }
        else
        {
            return true;
        }
    }

    public List<RegistrationFormDataModel> getAllUserDetails() {


        List<UserRegistration> list =  operation.allRows();
        List<RegistrationFormDataModel> newList = new ArrayList<>();
        for(UserRegistration x : list) {
            newList.add(conversion.toModel(x));
        }
        return newList;
    }

}


