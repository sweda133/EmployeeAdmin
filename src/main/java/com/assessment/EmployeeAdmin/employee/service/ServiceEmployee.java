package com.assessment.EmployeeAdmin.employee.service;

import com.assessment.EmployeeAdmin.employee.model.ModelEmployee;
import com.assessment.EmployeeAdmin.employee.repository.RepositoryEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceEmployee {
    @Autowired
    private RepositoryEmployee repositoryEmployee;
    public ModelEmployee saveEmployee(ModelEmployee employee) {

        return repositoryEmployee.save(employee);
    }
    public List<ModelEmployee> findAllEmployee() {
        return repositoryEmployee.findAll();
    }

    public Optional<ModelEmployee> getEmployeeModelById(Integer id) {

        return repositoryEmployee.findById(id);

    }

    public String deleteAllEmployee() {
        repositoryEmployee.deleteAll();
        return "All Learners Deleted";
    }
    public ModelEmployee updateEmployee(Integer id, ModelEmployee employeeDetails) {
        if (!repositoryEmployee.existsById(id)) {
            return null;
        }
        Optional<ModelEmployee> employee= repositoryEmployee.findById(id);
        ModelEmployee new_employee = employee.get();
        new_employee.setFirstName(employeeDetails.getFirstName());
        new_employee.setEmailId(employeeDetails.getEmailId());
        return repositoryEmployee.save(new_employee);
    }

}