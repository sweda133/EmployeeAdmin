package com.assessment.EmployeeAdmin.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class ModelEmployee {
    @Id
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "password")
    private String password;
}
