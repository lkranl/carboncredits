package com.eis.carboncredits.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evaluator {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    Long evaluatorId;
    String name;

    public Evaluator() {
    }

    public Evaluator(Long evaluatorId, String name) {
        this.evaluatorId = evaluatorId;
        this.name = name;
    }

    public Long getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(Long evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
