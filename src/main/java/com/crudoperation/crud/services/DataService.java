package com.crudoperation.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crudoperation.crud.entitys.EmployeeData;
import com.crudoperation.crud.interfaces.DataRepository;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    // Create
    public EmployeeData insertData(EmployeeData employeeData) {

        EmployeeData empData = this.dataRepository.save(employeeData);

        return empData;

    }

    // Read
    public Iterable<EmployeeData> readData() {

        Iterable<EmployeeData> data = this.dataRepository.findAll();

        return data;

    }

    // Read Single By Id
    public EmployeeData readSingle(int id) {
        EmployeeData singleData = this.dataRepository.findById(id);
        return singleData;
    }

    // Update Data
    public void updateData(int id, EmployeeData employeeData) {

        EmployeeData data = this.dataRepository.findById(id);

        data.setEmpName(employeeData.getEmpName());
        data.setEmpWork(employeeData.getEmpWork());

        this.dataRepository.save(data);

    }

    // Delete Data
    public void deleteData(int id) {

        EmployeeData data = this.dataRepository.findById(id);

        this.dataRepository.delete(data);

    }
}
