package com.crudoperation.crud.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.crudoperation.crud.entitys.EmployeeData;
import com.crudoperation.crud.services.DataService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    // Create
    @PostMapping("/insert")
    public ResponseEntity<EmployeeData> insert(@RequestBody EmployeeData employeeData) {
        try {

            EmployeeData data = this.dataService.insertData(employeeData);

            return ResponseEntity.of(Optional.of(data));

        } catch (Exception e) {

            e.getStackTrace();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // Read
    @GetMapping("/read")
    public ResponseEntity<Iterable<EmployeeData>> readData() {
        try {

            Iterable<EmployeeData> data = this.dataService.readData();

            return ResponseEntity.of(Optional.of(data));

        } catch (Exception e) {
            e.getStackTrace();

            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    // Read Single
    @GetMapping("/read-single")
    public ResponseEntity<EmployeeData> readSingleData(@PathVariable int id) {

        try {
            EmployeeData data = this.dataService.readSingle(id);
            return ResponseEntity.of(Optional.of(data));

        } catch (Exception e) {
            e.getStackTrace();
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        }

    }

    // Update
    @PutMapping("update")
    public ResponseEntity<String> update(@RequestBody EmployeeData employeeData, @PathVariable int id) {

        try {
            this.dataService.updateData(id, employeeData);

            return ResponseEntity.ok().body("Data is Updated");

        } catch (Exception e) {
            e.getStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
        }

    }

    // Delete
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@PathVariable int id) {
        try {

            this.dataService.deleteData(id);

            return ResponseEntity.ok().body("Delete Data Sucessfully");

        } catch (Exception e) {
            e.getStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
        }
    }

}
