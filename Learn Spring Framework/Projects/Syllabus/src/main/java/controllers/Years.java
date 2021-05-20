package controllers;

import ModelStructure.Subject;
import ModelStructure.YearAndSem;
import databaseOperation.CrudOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
@RequestMapping("/year")
public class Years {

    public final CrudOperation crudOperation;

    public Years(CrudOperation crudOperation) {
        this.crudOperation = crudOperation;
    }

    @RequestMapping(value = "/sem" , method = RequestMethod.POST)
    public String sem2(@ModelAttribute("yearAndSem") YearAndSem data , Model theModel) {
        System.out.println(data);

        try {
            List<Subject>  list= crudOperation.getList(String.valueOf(data.getYear()) , String.valueOf(data.getSem()));
            //theModel.addAttribute("list" ,list);
            for(Subject x:list) {
                System.out.println(x);
            }

            if(list.size() == 0) {
                return "index";
            }
            else {
                return "index";
            }
        }
        catch(Exception e) {
            return "index";
        }


    }


}
