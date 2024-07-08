package com.eis.carboncredits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.eis.carboncredits.models.Owner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eis.carboncredits.repositories.OwnerRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    private OwnerRepository repository;
    @GetMapping("/")
    public ResponseEntity<?> getOwners() {
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOwner(@RequestParam Long id) {
        return new ResponseEntity<>(this.repository.findById(id), HttpStatus.OK);
    }
    

    @PostMapping("/")
    public ResponseEntity<?> postOwners(@RequestBody Owner owner) {
        return new ResponseEntity<>(this.repository.save(owner), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchOwners(@RequestBody Owner owner){
        return new ResponseEntity<>(this.repository.save(owner), HttpStatus.ACCEPTED);
    }
    
}
