package com.eis.carboncredits.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Area {
    @Id
    Long areaId;
    String description;
    double forestPercentage;
    Owner owner;
    Evaluator evaluator;
    TypeOfStatus status;

    public Area() {
    }

    public Area(Long areaId, String description, double forestPercentage, Owner owner, Evaluator evaluator, TypeOfStatus status) {
        this.areaId = areaId;
        this.description = description;
        this.forestPercentage = forestPercentage;
        this.owner = owner;
        this.evaluator = evaluator;
        this.status = status;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getForestPercentage() {
        return forestPercentage;
    }

    public void setForestPercentage(double forestPercentage) {
        this.forestPercentage = forestPercentage;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Evaluator getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Evaluator evaluator) {
        this.evaluator = evaluator;
    }

    public TypeOfStatus getStatus() {
        return status;
    }

    public void setStatus(TypeOfStatus status) {
        this.status = status;
    }
}
