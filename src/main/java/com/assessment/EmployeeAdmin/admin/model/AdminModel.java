package com.assessment.EmployeeAdmin.admin.model;

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
@Table(name = "admin")
public class AdminModel {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email_id")
    private String email;
    @Column(name = "password")
    private String password;
}