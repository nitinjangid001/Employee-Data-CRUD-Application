package com.crudoperation.crud.entitys;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
 

@Entity
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    private String empName;

    private String empWork;

    @OneToOne(cascade = CascadeType.ALL)
    private EmployeePersonalDetails employeePersonalDetails;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpWork() {
        return empWork;
    }

    public void setEmpWork(String empWork) {
        this.empWork = empWork;
    }

    public EmployeePersonalDetails getEmployeePersonalDetails() {
        return employeePersonalDetails;
    }

    public void setEmployeePersonalDetails(EmployeePersonalDetails employeePersonalDetails) {
        this.employeePersonalDetails = employeePersonalDetails;
    }

    @Override
    public String toString() {
        return "EmployeeData [empId=" + empId + ", empName=" + empName + ", empWork=" + empWork
                + ", employeePersonalDetails=" + employeePersonalDetails + "]";
    }




}