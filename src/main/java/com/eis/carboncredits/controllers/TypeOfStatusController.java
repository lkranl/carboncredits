package com.eis.carboncredits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.eis.carboncredits.models.TypeOfStatus;
import com.eis.carboncredits.repositories.TypeOfStatusRepository;

public class TypeOfStatusController {
    @Autowired
    private TypeOfStatusRepository repository;
    @GetMapping("/")
    public ResponseEntity<?> getTypeOfStatus() {
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTypeOfStatus(@RequestParam Long id) {
        return new ResponseEntity<>(this.repository.findById(id), HttpStatus.OK);
    }
    

    @PostMapping("/")
    public ResponseEntity<?> postTypeOfStatus(@RequestBody TypeOfStatus typeOfStatus) {
        return new ResponseEntity<>(this.repository.save(typeOfStatus), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchTypeOfStatus(@RequestBody TypeOfStatus typeOfStatus){
        return new ResponseEntity<>(this.repository.save(typeOfStatus), HttpStatus.ACCEPTED);
    }
}
