package com.eis.carboncredits.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TypeOfStatus {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    Long toStatusId;
    String name;
    Long order;

    public TypeOfStatus() {
    }

    public TypeOfStatus(Long toStatusId, String name, Long order) {
        this.toStatusId = toStatusId;
        this.name = name;
        this.order = order;
    }

    public Long getToStatusId() {
        return toStatusId;
    }

    public void setToStatusId(Long toStatusId) {
        this.toStatusId = toStatusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

}
