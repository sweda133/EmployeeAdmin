package com.assessment.EmployeeAdmin.admin.controller;

import com.assessment.EmployeeAdmin.admin.service.ServiceAdmin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assessment.EmployeeAdmin.admin.model.AdminModel;
        import com.assessment.EmployeeAdmin.admin.service.ServiceAdmin;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup")
@CrossOrigin(origins = "http://localhost:4000")
public class ControllerAdmin {
    @Autowired
    private ServiceAdmin serviceAdmin;
    @PostMapping("save")
    public AdminModel saveDetails(@RequestBody AdminModel payload) {
        return serviceAdmin.saveDetails(payload);
    }
}