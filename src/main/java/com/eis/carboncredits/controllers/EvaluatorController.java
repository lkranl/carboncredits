package com.eis.carboncredits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.eis.carboncredits.models.Evaluator;
import com.eis.carboncredits.repositories.EvaluatorRepository;

public class EvaluatorController {
    @Autowired
    private EvaluatorRepository repository;
    @GetMapping("/")
    public ResponseEntity<?> getEvaluators() {
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEvaluator(@RequestParam Long id) {
        return new ResponseEntity<>(this.repository.findById(id), HttpStatus.OK);
    }
    

    @PostMapping("/")
    public ResponseEntity<?> postEvaluators(@RequestBody Evaluator evaluator) {
        return new ResponseEntity<>(this.repository.save(evaluator), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchEvaluators(@RequestBody Evaluator evaluator){
        return new ResponseEntity<>(this.repository.save(evaluator), HttpStatus.ACCEPTED);
    }
}
