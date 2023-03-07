package com.assessment.EmployeeAdmin.admin.repository;

import com.assessment.EmployeeAdmin.admin.model.AdminModel;
import com.assessment.EmployeeAdmin.employee.model.ModelEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAdmin extends JpaRepository<AdminModel,Integer> {
}
