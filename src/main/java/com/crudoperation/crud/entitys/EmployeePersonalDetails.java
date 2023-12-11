package com.crudoperation.crud.entitys;

 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
 

@Entity
public class EmployeePersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    @Column(name = "EmployeePersonalDetails_Id")
    private int empID;

    private String empFathername;

    private String motherName;
 
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFathername() {
        return empFathername;
    }

    public void setEmpFathername(String empFathername) {
        this.empFathername = empFathername;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

     

    @Override
    public String toString() {
        return "EmployeePersonalDetails [empID=" + empID + ", empFathername=" + empFathername + ", motherName="
                + motherName + "]";
    }

    

}