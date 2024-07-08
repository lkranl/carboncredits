package com.eis.carboncredits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.eis.carboncredits.models.Area;
import com.eis.carboncredits.repositories.AreaRepository;

public class AreaController {
    @Autowired
    private AreaRepository repository;
    @GetMapping("/")
    public ResponseEntity<?> getAreas() {
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getArea(@RequestParam Long id) {
        return new ResponseEntity<>(this.repository.findById(id), HttpStatus.OK);
    }
    

    @PostMapping("/")
    public ResponseEntity<?> postAreas(@RequestBody Area area) {
        return new ResponseEntity<>(this.repository.save(area), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchAreas(@RequestBody Area area){
        return new ResponseEntity<>(this.repository.save(area), HttpStatus.ACCEPTED);
    }
}
