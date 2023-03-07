package com.assessment.EmployeeAdmin.employee.controller;
import com.assessment.EmployeeAdmin.employee.exception.EmailException;
import com.assessment.EmployeeAdmin.employee.exception.EmployeeException;
import com.assessment.EmployeeAdmin.employee.model.ModelEmployee;
import com.assessment.EmployeeAdmin.employee.service.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee/v1/")
@CrossOrigin(origins = "http://localhost:4000")
public class ControllerEmployee {
    @Autowired
    private ServiceEmployee serviceEmployee;

    @RequestMapping(value = "/saveemployee", method = RequestMethod.GET)
    public ModelEmployee saveEmployee(@RequestBody ModelEmployee payload)  {
        return serviceEmployee.saveEmployee(payload);
    }


    @RequestMapping(value = "/getemployee", method = RequestMethod.GET)
    public List<ModelEmployee> modelEmployees() {

        return serviceEmployee.findAllEmployee();

    }
    @RequestMapping(value = "/employeeById/{id}", method = RequestMethod.GET)
    public Optional<ModelEmployee> employeeById(@PathVariable("id") int id) throws EmployeeException {
        Optional<ModelEmployee>  modelEmployee=serviceEmployee.getEmployeeModelById(id);
        if(modelEmployee.isEmpty())
            throw new EmployeeException("EMPLOYEE not found");
        return modelEmployee;
    }

    @RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE)
    public String deleteLearners() {
        return serviceEmployee.deleteAllEmployee();
    }
    @RequestMapping(value = "/updateemployeebyid/{id}", method = RequestMethod.PUT)
    public ModelEmployee updateEmployeeById(@PathVariable("id") int id, @RequestBody ModelEmployee emloyeeDetails) throws  EmployeeException, EmailException {
        Optional<ModelEmployee> employeeModel=serviceEmployee.getEmployeeModelById(id);
        if(employeeModel.isEmpty())
        {
            throw  new EmployeeException("can not update user does not exsits");
        }
        String emp=emloyeeDetails.getEmailId();
        if(emp.contains("@"))
            throw new EmailException("Cant change the email");

        return serviceEmployee.updateEmployee(id, emloyeeDetails);
    }
}
