package com.Hamroush.employee_management.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @Size(max=50)@Column(name="first_name")
    private String firstName;

    @NotBlank @Size(max=50)@Column(name = "last_name")
    private String lastName;

    @NotBlank @Size(max=100) @Email
    private String email;

    @DecimalMin("0.0")
    @Column(nullable = false)
    private BigDecimal salary;


    @ManyToOne @JoinColumn(name="department_id")
    private Department department;



}
