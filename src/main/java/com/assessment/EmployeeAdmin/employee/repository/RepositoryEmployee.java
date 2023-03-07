package com.assessment.EmployeeAdmin.employee.repository;

import com.assessment.EmployeeAdmin.employee.model.ModelEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployee extends JpaRepository<ModelEmployee,Integer> {
}
