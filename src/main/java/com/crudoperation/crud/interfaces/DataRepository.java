package com.crudoperation.crud.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.crudoperation.crud.entitys.EmployeeData;

// This will be auto implemented by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DataRepository extends CrudRepository<EmployeeData ,  Integer> {

    public EmployeeData findById(int id);
    
}  