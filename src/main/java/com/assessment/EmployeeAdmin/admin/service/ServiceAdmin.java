package com.assessment.EmployeeAdmin.admin.service;


import com.assessment.EmployeeAdmin.admin.model.AdminModel;
import com.assessment.EmployeeAdmin.admin.repository.RepositoryAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    public class ServiceAdmin {
        @Autowired
        private RepositoryAdmin repositoryAdmin;

        public AdminModel saveDetails(AdminModel payload) {
            return repositoryAdmin.save(payload);
        }
    }





